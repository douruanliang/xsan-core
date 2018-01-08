package org.security.core.properties;

import org.springframework.boot.autoconfigure.social.SocialProperties;


/**
 * 
 * @author dourl
 *
 */
public class WeixinProperties extends SocialProperties {
	//第三方id 用来决定发起第三方登录的url
	private String providerId = "weixin";

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}
	
	
}
