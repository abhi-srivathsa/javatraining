package com.del.jpa;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="mgr3_hib")
@DiscriminatorValue("MGR")
public class Manager extends Employee {
	private String dept;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager( String name, long mobile) {
		super( name, mobile);
		// TODO Auto-generated constructor stub
	}

	public Manager(String dept) {
		super();
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Manager [dept=" + dept + "]";
	}

}
