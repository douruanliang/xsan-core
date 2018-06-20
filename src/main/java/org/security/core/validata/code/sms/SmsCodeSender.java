package org.security.core.validata.code.sms;


/**
 * 向手机发短信验证码
 * @author dourl
 *
 */
public interface SmsCodeSender {
   void send(String mobile,String code);
}
