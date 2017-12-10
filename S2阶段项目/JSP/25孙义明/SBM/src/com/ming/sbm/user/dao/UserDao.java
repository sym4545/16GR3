package com.ming.sbm.user.dao;

import com.ming.sbm.user.bean.User;

public interface UserDao {
	
	public User doLogin(String userName,String passWord);
//	public User getUsers(User users); 
}
