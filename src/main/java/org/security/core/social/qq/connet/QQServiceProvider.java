package org.security.core.social.qq.connet;

import org.security.core.social.qq.api.QQ;
import org.security.core.social.qq.api.QQImpl;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;

public class QQServiceProvider extends AbstractOAuth2ServiceProvider<QQ>{

	private String appId;
	//引导用户跳转 用户授权 获取 授权码
	private static final String URL_AUTHORIZE = "https://graph.qq.com/oauth2.0/authorize";
	//第4步 获取 token
	private static final String URL_ACCESS_TOKEN = "https://graph.qq.com/oauth2.0/token";
	
	public QQServiceProvider(String appId, String appSecret) {
		//super(new OAuth2Template(appId, appSecret, URL_AUTHORIZE, URL_ACCESS_TOKEN));
		super(new QQOAuth2Template(appId, appSecret, URL_AUTHORIZE, URL_ACCESS_TOKEN));
		this.appId=appId;
	}

	@Override
	public QQ getApi(String accessToken) {
		// TODO Auto-generated method stub
		return new QQImpl(accessToken, appId);
	}

}
