package org.security.core.validata.code;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Map;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.security.core.properties.SecurityConstants;
import org.security.core.properties.SecurityProperties;
import org.security.core.validata.code.image.ImageCode;
import org.security.core.validata.code.sms.SmsCodeSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.web.HttpSessionSessionStrategy;
import org.springframework.social.connect.web.SessionStrategy;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * 
 * @author dourl
 *
 */
@RestController
public class ValidateCodeController {

	@Autowired
	private ValidateCodeProcessorHolder validateCodeProcessorHolder;
	
	/*@Autowired
	private Map<String,ValidateCodeProcessor>  validateCodeProcessors;*/
	
	/**
	 * 创建验证码，根据验证码类型不同，
	 * 调用不同的 {@link ValidateCodeProcessor}接口实现
	 * @param request
	 * @param response
	 * @param type
	 * @throws Exception
	 */
	//@GetMapping("/code/{type}")
	@GetMapping(SecurityConstants.DEFAULT_VALIDATE_CODE_URL_PREFIX + "/{type}")
	public void createCode(HttpServletRequest request, HttpServletResponse response,@PathVariable String type) throws Exception{
		//validateCodeProcessors.get(type+"CodeProcessor").create(new ServletWebRequest(request,response));
		validateCodeProcessorHolder.findValidateCodeProcessor(type).create(new ServletWebRequest(request, response));
	}
	
	
	
	
	
	
	
	
	
	
	//-----------重构以前的------
/*	
	
	private SessionStrategy sessionStrategy = new HttpSessionSessionStrategy();
	
	@Autowired
	private ValidateCodeGenerator imageCodeGenerator;
	
	@Autowired
	private ValidateCodeGenerator smsCodeGenerator;
	
	@Autowired
	private SmsCodeSender smsCodeSender;*/
	/*
	@GetMapping("/code/image")
	public void createCode(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
	    //1.根据随机数生成图片
		ImageCode imageCode =(ImageCode) imageCodeGenerator.generate(new ServletWebRequest(request));
		//2.将随机数存储到Session中
		sessionStrategy.setAttribute(new ServletWebRequest(request), SESSION_KEY, imageCode);
		//3'在将生成的图片写到接口的响应中
		ImageIO.write(imageCode.getImage(), "JPEG", response.getOutputStream());
	}

	@GetMapping("/code/sms")
	public void createSmsCode(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletRequestBindingException {
		ValidateCode smsCode =smsCodeGenerator.generate(new ServletWebRequest(request));
		//2.将随机数存储到Session中
		sessionStrategy.setAttribute(new ServletWebRequest(request), SESSION_KEY, smsCode);
		
		String mobile = ServletRequestUtils.getRequiredStringParameter(request, "mobile");
		//3'在将生成的图片写到接口的响应中
		//ImageIO.write(imageCode.getImage(), "JPEG", response.getOutputStream());
		smsCodeSender.send(mobile, smsCode.getCode());
	}*/
	
	
}

	
	
	
	
	

