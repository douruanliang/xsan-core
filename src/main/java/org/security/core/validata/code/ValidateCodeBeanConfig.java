package org.security.core.validata.code;

import org.security.core.properties.SecurityProperties;
import org.security.core.validata.code.image.ImageCodeGenerator;
import org.security.core.validata.code.sms.DefaultSmsCodeSender;
import org.security.core.validata.code.sms.SmsCodeSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author dourl
 *  验证码实现类的配置类
 */

@Configuration
public class ValidateCodeBeanConfig {
  
	@Autowired
	private SecurityProperties securityProperties;
	
	@Bean
	@ConditionalOnMissingBean(name ="imageCodeGenerator")
	public ValidateCodeGenerator imageCodeGenerator(){
		ImageCodeGenerator codeGenerator = new ImageCodeGenerator();
		codeGenerator.setSecurityProperties(securityProperties);
		return codeGenerator;
	};
	
	/**
	 * 系统使用者向 系统 注册一个名子为“
	 * @return
	 */
	
	@Bean
	//@ConditionalOnMissingBean(name ="smsCodeGenerator")
	@ConditionalOnMissingBean(SmsCodeSender.class)
	public SmsCodeSender smsCodeGenerator(){
		
		return new DefaultSmsCodeSender();
	};
}
