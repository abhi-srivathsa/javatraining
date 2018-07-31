package com.del.jpa;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "stud_hib")
public class Student {
	@Id
	private String studentid;
	private String name;
	private String password;
	private String address;
	@ManyToMany
	@JoinTable(name="st_subject",joinColumns=@JoinColumn(name="st_id" , referencedColumnName="studentid"), inverseJoinColumns=@JoinColumn(name="sub_id",referencedColumnName="subjectid"))
	private List<Subject> subList;

	public Student(String studentid, String name, String password, String address, List<Subject> subList) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.password = password;
		this.address = address;
		this.subList = subList;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String studentid, String name, String password, String address) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.password = password;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", name=" + name + ", password=" + password + ", address=" + address
				+ ", subList=" + subList + "]";
	}

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
