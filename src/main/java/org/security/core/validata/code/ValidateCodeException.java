package org.security.core.validata.code;

import org.springframework.security.core.AuthenticationException;


/**
 * 验证码异常
 * @author dourl
 *
 */
public class ValidateCodeException extends AuthenticationException{

	private static final long serialVersionUID = 1L;

	public ValidateCodeException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}

}
