package com.qhit.lh.gr3.ming;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.gr3.ming.bean.Emp;
import com.qhit.lh.gr3.ming.bean.Type;
import com.qhit.lh.gr3.ming.service.BaseService;
import com.qhit.lh.gr3.ming.service.impl.BaseServiceImpl;

public class EmpTest {
	private BaseService bs=new BaseServiceImpl();
	@Test
	public void add(){
		Emp emp = new Emp();
		emp.setEname("小红");
		emp.setSex("女");
		emp.setOld(18);
		Type type=new Type();
		type=(Type) bs.getObjectById(type, 1);
	}

}
