package com.qhit.lh.gr3.ming.bean;

/**
 * Emp entity. @author MyEclipse Persistence Tools
 */

public class Emp implements java.io.Serializable {
	// Fields
	private Integer eid;
	private String ename;
	private String sex;
	private Integer did;
	private User user ; 
	private Dept dept ;
	// Constructors
	/** default constructor */
	public Emp() {
	}

	/** full constructor */
	public Emp(String ename, String sex, Integer did) {
		this.ename = ename;
		this.sex = sex;
		this.did = did;
	}

	// Property accessors

	public Integer getEid() {
		return this.eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getDid() {
		return this.did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

}