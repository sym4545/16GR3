package com.qhit.lh.gr3;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.gr3.ming.bean.Role;
import com.qhit.lh.gr3.ming.bean.User;
import com.qhit.lh.gr3.ming.service.BaseService;
import com.qhit.lh.gr3.ming.service.impl.BaseServiceImpl;

public class RoleTest {
	BaseService bs = new BaseServiceImpl();
	@Test
	public void add(){
	Role role = new Role();
	role.setRoleName("主席");
	User user = (User) bs.getObjectById(User.class, 1);
	role.getUsers().add(user);
	bs.add(role);
	}
	@Test
	public void del(){
		Role role = (Role) bs.getObjectById(Role.class, 2);
		bs.del(role);
	}
	@Test
	public void select(){
		Role role = (Role) bs.getObjectById(Role.class, 3);
		for (User user : role.getUsers()) {
			System.out.println(user.getName()+":"+user.getUid());
		}
	}
}
