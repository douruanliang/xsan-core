package org.security.core.authorize;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;

/**
 * 
 * 类名称：AuthorizeConfigProvider   
 * 类描述：收集授权接口
 * 创建人：dourl   
 * 创建时间：2018年1月10日 下午7:27:55 
 * @version
 */
public interface AuthorizeConfigProvider {
  void config(ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry config);
}
