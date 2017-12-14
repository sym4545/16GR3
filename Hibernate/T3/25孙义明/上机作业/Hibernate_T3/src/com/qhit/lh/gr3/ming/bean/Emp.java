package com.qhit.lh.gr3.ming.bean;

/**
 * @author MING
 *
 */
public class Emp {

	private int eid;
	private String ename;
	private String sex;
	private int old;
	private Type type;
	public Emp(int eid, String ename, String sex, int old) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sex = sex;
		this.old = old;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int eid, String ename, String sex, int old, Type type) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sex = sex;
		this.old = old;
		this.type = type;
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
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
	
}
