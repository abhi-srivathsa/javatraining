package com.del.jdbc.bean;

public class Employee {
private int id;
private String name;
private long mobile;
private String designation;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, long mobile, String designation) {
	super();
	this.id = id;
	this.name = name;
	this.mobile = mobile;
	this.designation = designation;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", mobile=" + mobile + ", designation=" + designation + "]";
}

}
