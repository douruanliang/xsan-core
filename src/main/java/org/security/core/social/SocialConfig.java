/**
 * 
 */
package org.security.core.social;

import javax.sql.DataSource;

import org.security.core.properties.SecurityProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.social.config.annotation.EnableSocial;
import org.springframework.social.config.annotation.SocialConfigurerAdapter;
import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.ConnectionSignUp;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.connect.jdbc.JdbcUsersConnectionRepository;
import org.springframework.social.connect.web.ProviderSignInUtils;
import org.springframework.social.security.SpringSocialConfigurer;



@Configuration
@EnableSocial
public class SocialConfig extends SocialConfigurerAdapter {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private SecurityProperties securityProperties;
	
	//并不是所有系统都需要后台注册
	@Autowired(required=false)
	private ConnectionSignUp connectionSignUp;

	@Override
	public UsersConnectionRepository getUsersConnectionRepository(ConnectionFactoryLocator connectionFactoryLocator) {
		JdbcUsersConnectionRepository repository = new JdbcUsersConnectionRepository(dataSource,
				connectionFactoryLocator, Encryptors.noOpText());
		repository.setTablePrefix("xs_");
		
		if(connectionSignUp != null) {
			repository.setConnectionSignUp(connectionSignUp);
		}
	
		return repository;
	}

	@Bean
	public SpringSocialConfigurer defaultSocialSecurityConfig() {
		//获取配置的url
		String filterProcessesUrl = securityProperties.getSocial().getFilterProcessesUrl();
		DefaultSpringSocialConfigurer configurer = new DefaultSpringSocialConfigurer(filterProcessesUrl);
	     //配置默认注册页面（如果用户没有配置注册url时用）
		configurer.signupUrl(securityProperties.getBrowser().getRegistPage());
		return configurer;
	}

	//spring social 作用
	/**
	 * 
	 * @Description:1、注册的时候拿到 social的信息
	 *              2、注册完后如何信息传给social
	 * @param connectionFactoryLocator
	 * @return ProviderSignInUtils  
	 * @throws
	 * @author dourl
	 * @date 2017年12月16日
	 */
	@Bean
	public ProviderSignInUtils providerSignInUtils(ConnectionFactoryLocator connectionFactoryLocator) {
		
		return new ProviderSignInUtils(connectionFactoryLocator,
				getUsersConnectionRepository(connectionFactoryLocator)) {
		};
	}
}
