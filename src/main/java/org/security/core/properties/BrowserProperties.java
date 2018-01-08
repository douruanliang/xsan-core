package org.security.core.properties;



/**
 * 
 * @author dourl
 *
 */
public class BrowserProperties {
 
	private SessionProperties session = new SessionProperties();
	//private String loginPage ="/browser-default-login.html";
	//默认注册页面
	private String registPage ="/browser-default-regist.html";
	//默认登录页面
	private String loginPage = SecurityConstants.DEFAULT_LOGIN_PAGE_URL;
	
	//默认退出属性
	private String logOut="";
	//默认返回方式
    private LoginType loginType = LoginType.REDIRECT;
    
    private int rememberMeSeconds =3600;

    
    
	public int getRememberMeSeconds() {
		return rememberMeSeconds;
	}

	public void setRememberMeSeconds(int rememberMeSeconds) {
		this.rememberMeSeconds = rememberMeSeconds;
	}

	public String getLoginPage() {
		return loginPage;
	}

	public void setLoginPage(String loginPage) {
		this.loginPage = loginPage;
	}

	public LoginType getLoginType() {
		return loginType;
	}

	public void setLoginType(LoginType loginType) {
		this.loginType = loginType;
	}

	public String getRegistPage() {
		return registPage;
	}

	public void setRegistPage(String registPage) {
		this.registPage = registPage;
	}

	public SessionProperties getSession() {
		return session;
	}

	public void setSession(SessionProperties session) {
		this.session = session;
	}

	public String getLogOut() {
		return logOut;
	}

	public void setLogOut(String logOut) {
		this.logOut = logOut;
	}
	
	
}
