package com.del.jpa;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.engine.Cascade;

@Entity
@Table(name ="emp_hib")
public class Employee {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private String name;
	private long mobileno;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="addr_id")
	private Address add;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", mobileno=" + mobileno + ", add=" + add + "]";
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
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public Employee(int id, String name, long mobileno, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.mobileno = mobileno;
		this.add = add;
	}
	public Employee( String name, long mobileno, Address add) {
		
		this.name = name;
		this.mobileno = mobileno;
		this.add = add;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
