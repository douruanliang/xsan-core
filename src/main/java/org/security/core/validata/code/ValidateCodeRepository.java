package org.security.core.validata.code;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * 
 * @author dourl
 *
 */
public interface ValidateCodeRepository {

	/**
	 * 保存校验码
	 * @param request
	 * @param code
	 * @param validateCodeType
	 */
	void save(ServletWebRequest request,ValidateCode code,ValidateCodeType validateCodeType);
	/**
	 * 获取校验码
	 * @param request
	 * @param validateCodeType
	 * @return
	 */
	ValidateCode get(ServletWebRequest request,ValidateCodeType validateCodeType);
	
	/**
	 * 移除校验码
	 * @param request
	 * @param validateCodeType
	 */
	void removeget(ServletWebRequest request,ValidateCodeType validateCodeType);
}
