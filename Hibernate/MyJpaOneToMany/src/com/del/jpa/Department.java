package com.del.jpa;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.engine.Cascade;
@Entity
@Table(name="dept2_hib")
public class Department {
	@Id
	private int id;
	private String name;
	@OneToMany(mappedBy="dept", cascade= CascadeType.ALL) // if one dept gets deleted then delete others
	private Set<Employee> empset = new HashSet<>();

	public Department() {
		super();
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", empset=" + empset + "]";
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

	public Set<Employee> getEmpset() {
		return empset;
	}

	public void setEmpset(Set<Employee> empset) {
		this.empset = empset;
	}

	public Department(int id, String name, Set<Employee> empset) {
		super();
		this.id = id;
		this.name = name;
		this.empset = empset;
	}

}
