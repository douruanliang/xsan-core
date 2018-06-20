package org.security.core.authorize;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;

/**
 * 
 * 类名称：AuthorizeConfigManager   
 * 类描述：   
 * 创建人：dourl   
 * 创建时间：2018年1月10日 下午7:36:39 
 * @version
 */
public interface AuthorizeConfigManager {
	void config(ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry configmanager);
}
