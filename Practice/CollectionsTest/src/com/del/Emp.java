package com.del;

public class Emp implements Comparable<Emp> {
	private int id;
	private String name;
	private long mobile;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		System.out.println("hashcode check");
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals check");
		Emp e =(Emp) obj;
		return name.equals(e.getName())&&mobile==e.getMobile();
	}
	@Override
	public String toString() {			//for printing the object
		return "Emp [id=" + id + ", name=" + name + ", mobile=" + mobile + "] \n";
	}
	public Emp(int id, String name, long mobile) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
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
	@Override
	public int compareTo(Emp arg0) {
		// TODO Auto-generated method stub
		return id-arg0.getId();
	}
	
}
