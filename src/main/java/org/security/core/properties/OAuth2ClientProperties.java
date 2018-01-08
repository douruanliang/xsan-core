package org.security.core.properties;

public class OAuth2ClientProperties {

	private String clientId;
	
	private String cllietSecret;
	
	private int accessTokenValidateSeconds;
	
	

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getCllietSecret() {
		return cllietSecret;
	}

	public void setCllietSecret(String cllietSecret) {
		this.cllietSecret = cllietSecret;
	}

	public int getAccessTokenValidateSeconds() {
		return accessTokenValidateSeconds;
	}

	public void setAccessTokenValidateSeconds(int accessTokenValidateSeconds) {
		this.accessTokenValidateSeconds = accessTokenValidateSeconds;
	}

	
}
