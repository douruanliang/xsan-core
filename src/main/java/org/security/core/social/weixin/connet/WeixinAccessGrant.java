package org.security.core.social.weixin.connet;

import org.springframework.social.oauth2.AccessGrant;


/**
 * 微信在获取access_token时会同时返回openId,
 * 并没有单独的通过accessToke换取openId的服务
 * 在这里继承了标准AccessGrant，添加了openId字段，
 * 作为对微信access_token信息的扩展
 * @author dourl
 *
 */
public class WeixinAccessGrant extends AccessGrant {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8890338276754713190L;
	private String openId;
	public WeixinAccessGrant(String accessToken, String string, String string2, Long long1) {
		super(accessToken);
		// TODO Auto-generated constructor stub
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
    
}
