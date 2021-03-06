package org.security.core.validata.code.sms;

import org.security.core.properties.SecurityConstants;
import org.security.core.validata.code.ValidateCode;
import org.security.core.validata.code.impl.AbstractValidateCodeProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * 短信验证码处理器
 * @author dourl
 *
 */
@Component("smsValidateCodeProcessor")
public class SmsCodeProcessor extends AbstractValidateCodeProcessor<ValidateCode> {
    @Autowired
	private SmsCodeSender smsCodeSender;
	@Override
	protected void send(ServletWebRequest request, ValidateCode validateCode) throws Exception {

		String paramName = SecurityConstants.DEFAULT_PARAMETER_NAME_MOBILE;
		String mobile = ServletRequestUtils.getRequiredStringParameter(request.getRequest(), paramName );
		smsCodeSender.send(mobile, validateCode.getCode());
	}

}
