package org.security.core.authorize;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.stereotype.Component;

//收据所有授权AuthorizeConfigProvider
@Component
public class DefaultAuthorizeConfigManager implements AuthorizeConfigManager {

	@Autowired
	private List<AuthorizeConfigProvider> authorizeConfigProviders;
	@Override
	public void config(
			ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry configManager) {
		//授权提供器
		for(AuthorizeConfigProvider authorizeConfigProvider :authorizeConfigProviders){
			authorizeConfigProvider.config(configManager);
		}
        configManager.anyRequest().authenticated();
	}

}
