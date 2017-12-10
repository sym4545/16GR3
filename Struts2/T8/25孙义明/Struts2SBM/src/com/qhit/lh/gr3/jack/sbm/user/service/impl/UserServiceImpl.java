/**
 * 
 */
package com.qhit.lh.gr3.jack.sbm.user.service.impl;

import java.util.List;

import com.qhit.lh.gr3.jack.sbm.user.bean.User;
import com.qhit.lh.gr3.jack.sbm.user.dao.UserDao;
import com.qhit.lh.gr3.jack.sbm.user.dao.impl.UserDaoImpl;
import com.qhit.lh.gr3.jack.sbm.user.service.UserService;
/**
 * @author jack
 *	TODO
 * 2017年12月7日下午5:38:23
 */
public class UserServiceImpl implements UserService {
	private UserDao userDao = new UserDaoImpl();

	@Override
	public User doLogin(String userName, String userPassword) {
		// TODO Auto-generated method stub
		return userDao.doLogin(userName, userPassword);
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.jay.sbm.user.service.UserService#getAll()
	 */
	@Override
	public List<User> getAll() throws Exception {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}

}
