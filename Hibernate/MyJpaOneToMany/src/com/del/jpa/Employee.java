package com.del.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="emp2_hib")
public class Employee {
	@Id
	private int id;
	private String name;
	@Column(name="desig")
	private String designation;
	@ManyToOne
	@JoinColumn(name = "dept_id")
	private Department dept;

	public Employee() {
		super();

	}

	public Employee(int id, String name, String designation, Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "\n Employee [id=" + id + ", name=" + name + ", designation=" + designation +"]";
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

}
