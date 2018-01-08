package org.security.core.properties;

/**
 * 验证码的默认配置
 * @author dourl
 *
 */
public class SmsCodeProperties {

	private int length =6;
	private int expireIn =60;
	//拦截接口 ","分割
	private String url ;
	
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getExpireIn() {
		return expireIn;
	}
	public void setExpireIn(int expireIn) {
		this.expireIn = expireIn;
	}
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public SmsCodeProperties() {
		super();
		// TODO Auto-generated constructor stub
	}
}
