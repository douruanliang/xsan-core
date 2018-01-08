package org.security.core.social.qq.connet;

import org.security.core.social.qq.api.QQ;
import org.security.core.social.qq.api.QQUserInfo;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;

public class QQAdapter implements ApiAdapter<QQ> {

	@Override
	public UserProfile fetchUserProfile(QQ api) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setConnectionValues(QQ api, ConnectionValues values) {
		QQUserInfo userInfo = api.getUserInfo();
		values.setDisplayName(userInfo.getNickname());
		values.setImageUrl(userInfo.getFigureurl_qq_1());
		values.setProfileUrl(null);
		values.setProviderUserId(userInfo.getOpenId());
		
	}

	@Override
	public boolean test(QQ api) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateStatus(QQ arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

}
