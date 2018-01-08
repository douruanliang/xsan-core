package org.security.core.validata.code.image;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

public class ImageCodeCGQ {
	//将要保存的图片
	private BufferedImage image; 
	//随机数
	private String code;
	 //过期时间
	private LocalDateTime expireTime;

	public ImageCodeCGQ(BufferedImage image, String code, int seconds) {
		this.image = image;
		this.code = code;
		this.expireTime = LocalDateTime.now().plusSeconds(seconds);
	}
	
	
	public ImageCodeCGQ(BufferedImage image, String code, LocalDateTime expireTime) {
		this.image = image;
		this.code = code;
		this.expireTime = expireTime;
	}
	public boolean isExpried() {
		return LocalDateTime.now().isAfter(expireTime);
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public LocalDateTime getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(LocalDateTime expireTime) {
		this.expireTime = expireTime;
	}
	
	
	
	
}
