package com.qhit.lh.gr3.ming.bean;

public class Type {

	private int tid;
	private String tname;
	
	public Type() {
		super();
	}
	public Type(String tname) {
		super();
		this.tname = tname;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}

}
