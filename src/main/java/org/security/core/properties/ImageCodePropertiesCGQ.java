package org.security.core.properties;

/**
 * 验证码的默认配置
 * @author dourl
 *
 */
public class ImageCodePropertiesCGQ {
	

	private int width = 67;
	private int height = 23;
	
	private int length =4;
	private int expireIn =60;
	//拦截接口 ","分割
	private String url ;
	
	public int getWidth() {
		return width;
	}
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
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public ImageCodePropertiesCGQ() {
		super();
		// TODO Auto-generated constructor stub
	}
}
