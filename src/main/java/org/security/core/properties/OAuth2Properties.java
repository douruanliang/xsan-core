package org.security.core.properties;

/**
 * 支持多应用配置
 * @author dourl
 *
 */
public class OAuth2Properties {
   
	//签名秘钥
	private String  jwtSigningKey = "xsan";
	private OAuth2ClientProperties[] clients ={};

	public OAuth2ClientProperties[] getClients() {
		return clients;
	}

	public void setClients(OAuth2ClientProperties[] clients) {
		this.clients = clients;
	}

	public String getJwtSigningKey() {
		return jwtSigningKey;
	}

	public void setJwtSigningKey(String jwtSigningKey) {
		this.jwtSigningKey = jwtSigningKey;
	}
	
}
