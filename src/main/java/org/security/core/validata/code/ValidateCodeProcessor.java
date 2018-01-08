package org.security.core.validata.code;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * 检验码处理器（处理逻辑），封装不同的校验码
 * @author dourl
 *
 */
public interface ValidateCodeProcessor {
	
	/**
	 * 校验码放入Session时的前缀
	 */
	String SESSION_KEY_PREFIX = "SESSION_KEY_FOR_CODE_";
	
	/**
	 * 创建校验码
	 * @param request
	 * @throws Exception
	 */
	void create(ServletWebRequest request) throws Exception ;
	/**
	 * 校验验证码
	 * 
	 * @param servletWebRequest
	 * @throws Exception
	 */
	void validate(ServletWebRequest servletWebRequest);
	
}
