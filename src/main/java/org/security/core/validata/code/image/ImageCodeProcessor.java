package org.security.core.validata.code.image;

import javax.imageio.ImageIO;

import org.security.core.validata.code.impl.AbstractValidateCodeProcessor;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;


/**
 * 
 * @author 图片验证码处理器
 *
 */
@Component("imageValidateCodeProcessor")
public class ImageCodeProcessor extends AbstractValidateCodeProcessor<ImageCode> {

	@Override
	protected void send(ServletWebRequest request, ImageCode validateCode) throws Exception {
		ImageIO.write(validateCode.getImage(), "JPEG", request.getResponse().getOutputStream());
		
	}

}
