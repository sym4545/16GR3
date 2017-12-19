package com.qhit.lh.gr3;

import static org.junit.Assert.*;

import com.qhit.lh.gr3.ming.bean.Dept;
import com.qhit.lh.gr3.ming.bean.Emp;
import com.qhit.lh.gr3.ming.bean.User;
import com.qhit.lh.gr3.ming.service.BaseService;
import com.qhit.lh.gr3.ming.service.impl.BaseServiceImpl;

public class Test {
	BaseService bs = new 	BaseServiceImpl();
	@org.junit.Test
	public void add(){
		Emp emp1 = new Emp();
		emp1.setEname("11111111");
		emp1.setSex("女");
		Emp emp2 = new Emp();
		emp2.setEname("22222222");
		emp2.setSex("女");
		//dept
		Dept dept = new Dept();
		dept.setDname("国防部");
		//n-1
		dept.getEmps().add(emp1);
		dept.getEmps().add(emp2);
		bs.add(dept);
	}
	

}
