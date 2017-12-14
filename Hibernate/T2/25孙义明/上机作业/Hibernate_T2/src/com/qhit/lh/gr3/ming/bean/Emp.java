package com.qhit.lh.gr3.ming.bean;

public class Emp {
	private int eid;
	private String ename;
	private String sex;
	private int old;
	private User user;
	public Emp(int eid, String ename, String sex, int old) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sex = sex;
		this.old = old;
	}
	
	public Emp(int eid, String ename, String sex, int old, User user) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sex = sex;
		this.old = old;
		this.user = user;
	}
	public Emp(String ename, String sex, int old) {
		super();
		this.ename = ename;
		this.sex = sex;
		this.old = old;
	}

	public Emp() {
		super();
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getOld() {
		return old;
	}
	public void setOld(int old) {
		this.old = old;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
