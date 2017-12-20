package com.qhit.lh.gr3.ming.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * @authorMING
 *
 */
public class Role {

	private int roleId;
	private String roleName;
	private Set<User> users = new HashSet<>();
	
	public Role() {
		super();
	}
	public Role(int roleId, String roleName) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
	}
	public Role(int roleId, String roleName, Set<User> users) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.users = users;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
}
