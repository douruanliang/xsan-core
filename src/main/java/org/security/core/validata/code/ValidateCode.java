package org.security.core.validata.code;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ValidateCode implements Serializable {

	private static final long serialVersionUID = -6731641581464759417L;
	//随机数
	private String code;
	 //过期时间
	private LocalDateTime expireTime;

	public ValidateCode(String code, int seconds) {
	
		this.code = code;
		this.expireTime = LocalDateTime.now().plusSeconds(seconds);
	}
	
	
	public ValidateCode(String code, LocalDateTime expireTime) {
	
		this.code = code;
		this.expireTime = expireTime;
	}
	public boolean isExpried() {
		return LocalDateTime.now().isAfter(expireTime);
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
