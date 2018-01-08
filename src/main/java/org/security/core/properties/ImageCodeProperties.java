package org.security.core.properties;

/**
 * 验证码的默认配置
 * @author dourl
 * 图形验证码一般是 4 位，短信验证码一般 是 6位
 */
public class ImageCodeProperties extends SmsCodeProperties {

	//添加默认长度
	public ImageCodeProperties() {
		setLength(4);
	}

	private int width = 67;
	private int height = 23;
	
	
	public int getWidth() {
		return width;
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
	
}
