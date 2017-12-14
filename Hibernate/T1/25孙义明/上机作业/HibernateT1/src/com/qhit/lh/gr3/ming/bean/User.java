package com.qhit.lh.gr3.ming.bean;

public class User {
private int id ;
private String uname;
private String upwd;
private int age ; 
private String phone;
public User(int id, String uname, String upwd, int age, String phone) {
	super();
	this.id = id;
	this.uname = uname;
	this.upwd = upwd;
	this.age = age;
	this.phone = phone;
}
public User() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUpwd() {
	return upwd;
}
public void setUpwd(String upwd) {
	this.upwd = upwd;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
	
}
