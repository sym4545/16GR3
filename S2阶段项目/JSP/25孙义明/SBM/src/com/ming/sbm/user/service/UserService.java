package com.ming.sbm.user.service;

import com.ming.sbm.conmon.bean.PageBean;
import com.ming.sbm.user.bean.User;

public interface UserService {
	/**
	 * @param userName
	 * @param passWord
	 * @return
	 * ��¼��ҵ��
	 */
	public User doLogin(String userName,String userPassword);
	public User getUsers(User users); 
}
