package com.ming.sbm.user.service.impl;

import com.ming.sbm.user.bean.User;
import com.ming.sbm.user.dao.impl.UserDaoimpl;
import com.ming.sbm.user.service.UserService;

public class UserServiceimpl implements UserService {

	@Override
	public User doLogin(String userName, String userPassword) {
		// TODO Auto-generated method stub
		return new UserDaoimpl().doLogin(userName, userPassword);
	}

	@Override
	public User getUsers(User users) {
		// TODO Auto-generated method stub
		return null;
	}

}
