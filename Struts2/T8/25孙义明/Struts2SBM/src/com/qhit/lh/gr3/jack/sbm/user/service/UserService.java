/**
 * 
 */
package com.qhit.lh.gr3.jack.sbm.user.service;

import java.util.List;

import com.qhit.lh.gr3.jack.sbm.user.bean.User;
/**
 * @author jack
 *	TODO
 * 2017年12月7日下午5:38:34
 */
public interface UserService {
	/**
	 * @return
	 * 查询所有的用户
	 * @throws Exception 
	 */
	public List<User> getAll() throws Exception;
	
	/**
	 * @param user
	 * @return
	 * 添加用户
	 */
	public int addUser(User user);

	/**
	 * @param userName
	 * @param userPassword
	 * @return
	 * 登录的业务
	 */
	public User doLogin(String userName,String userPassword);
}
