package org.security.core.validata.code.image;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

import org.security.core.validata.code.ValidateCode;

public class ImageCode extends ValidateCode {
	//将要保存的图片
	private BufferedImage image; 
	
	public ImageCode(BufferedImage image, String code, int seconds) {
		super(code, seconds);
		this.image = image;
		
	}
	
	public ImageCode(BufferedImage image, String code, LocalDateTime expireTime) {
		super(code, expireTime);
		this.image = image;
	
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	
	
	
	
	
}
