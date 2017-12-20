package com.qhit.lh.gr3.ming.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer uid;
	private String name;
	private String pwd;
	private Emp emp;
	private Set<Role> roles = new HashSet<>();

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public User(Integer uid, String name, String pwd, Emp emp, Set<Role> roles) {
		super();
		this.uid = uid;
		this.name = name;
		this.pwd = pwd;
		this.emp = emp;
		this.roles = roles;
	}

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String name, String pwd) {
		this.name = name;
		this.pwd = pwd;
	}

	// Property accessors

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

}