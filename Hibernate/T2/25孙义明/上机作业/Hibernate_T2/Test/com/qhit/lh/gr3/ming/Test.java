package com.qhit.lh.gr3.ming;

import static org.junit.Assert.*;

import com.qhit.lh.gr3.ming.bean.Emp;
import com.qhit.lh.gr3.ming.bean.User;
import com.qhit.lh.gr3.ming.service.BaseService;
import com.qhit.lh.gr3.ming.service.impl.BaseServiceImpl;

public class Test {
	BaseService bs = new BaseServiceImpl();
	@org.junit.Test
	public void add(){
		Emp emp = new Emp();
		emp.setEname("小红");
		emp.setSex("女");
		emp.setOld(18);
		User user = new User();
		user.setUname("小红");
		user.setUpwd("123456");
		//一对一
		emp.setUser(user);
		user.setEmp(emp);
		bs.add(emp);
	}

	
	
	
}
