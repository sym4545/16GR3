package com.qhit.lh.gr3.ming;

import com.qhit.lh.gr3.ming.bean.User;
import com.qhit.lh.gr3.ming.service.BaseService;
import com.qhit.lh.gr3.ming.service.impl.BaseServiceImpl;

/**
 * @author MING
 *
 */
public class UserTest {
	private BaseService baseService = new BaseServiceImpl();
	public  void add(){
		User user = new User();
		baseService.add(user);
	}
}