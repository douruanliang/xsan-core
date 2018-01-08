package org.security.core.properties;


/**
 * 第三方登录配置
 * @author dourl
 *
 */
public class SocialProperties {
    //默认QQ /auth
	private String filterProcessesUrl = "/auth";
	private QQProperties qq = new QQProperties();
	private WeixinProperties weixin = new WeixinProperties();
	public QQProperties getQq() {
		return qq;
	}

	public WeixinProperties getWeixin() {
		return weixin;
	}

	public void setWeixin(WeixinProperties weixin) {
		this.weixin = weixin;
	}

	public void setQq(QQProperties qq) {
		this.qq = qq;
	}

	public String getFilterProcessesUrl() {
		return filterProcessesUrl;
	}

	public void setFilterProcessesUrl(String filterProcessesUrl) {
		this.filterProcessesUrl = filterProcessesUrl;
	}
	
	
}
