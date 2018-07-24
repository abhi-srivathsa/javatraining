package com.del;

public class Emp implements Cloneable {
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("Finalised");
	}

	private int id;
	private String name;
	private long mobile;
	private Dept dept;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Emp cloned = (Emp) super.clone();
		Dept d = (Dept) dept.clone();
		cloned.setDept(d);
		return cloned;
	}

	public Emp(int id, String name, long mobile, Dept dept) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", mobile=" + mobile + ", dept=" + dept + "]";
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

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}
}
