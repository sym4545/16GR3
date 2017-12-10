/**
 * 
 */
package com.qhit.lh.gr3.jack.sbm.user.dao;

import java.util.List;

import com.qhit.lh.gr3.jack.sbm.user.bean.User;




public interface UserDao {
	
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
	 * 登錄的數據訪問
	 */
	public User doLogin(String userName,String userPassword);
}
