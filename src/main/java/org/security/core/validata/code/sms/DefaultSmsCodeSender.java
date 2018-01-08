package org.security.core.validata.code.sms;


/**
 * 默认发送者
 * @author dourl
 *
 */
public class DefaultSmsCodeSender implements SmsCodeSender {

	@Override
	public void send(String mobile, String code) {
		System.out.println("手机号"+mobile+"--验证码--"+code);

	}

}
