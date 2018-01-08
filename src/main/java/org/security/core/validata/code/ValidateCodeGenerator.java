package org.security.core.validata.code;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * 
 * @author dourl
 * 校验码的生成接口
 */

public interface ValidateCodeGenerator {
	ValidateCode generate(ServletWebRequest request);
}
