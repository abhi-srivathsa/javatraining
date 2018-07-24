package com.del;

public class CreateObject {
	public static void main(String[] args) {
		Dept d = new Dept(1212, "IT", "Bangalore");
		Emp e = new Emp(1234, "Tarun", 9012341234L, d);
		System.out.println(e);
		Emp e1 = null;
		try {
			e1 = (Emp) e.clone(); // casting to use the overridden clone function

			System.out.println(e1);
			System.out.println("same: " + (e == e1));
		} catch (CloneNotSupportedException e2) {
			e2.printStackTrace();
		}
		// e = null;
		// System.gc(); Never call this unless emergency
		e1.getDept().setLocation("Mumbai");
		System.out.println(e); // shallow cloning
		System.out.println("End of program");
	}
}
