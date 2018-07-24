package com.del;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmpSetTest {
public static void main(String[] args) {
	Set<Emp> EmployeeSet = new HashSet<>();
	EmployeeSet.add(new Emp(111, "Rohit", 9012131131L));
	EmployeeSet.add(new Emp(131, "Harsh", 9443652452L));
	EmployeeSet.add(new Emp(123, "Priyanka", 9345353124L));
	EmployeeSet.add(new Emp(143, "Debarati", 9257756312L));
	EmployeeSet.add(new Emp(175, "Nikhil", 9512135656L));
	EmployeeSet.add(new Emp(131, "Harsh", 9443652452L));
	System.out.println(EmployeeSet);
	Set<Emp> sortedEmpset = new TreeSet<>(EmployeeSet);
	System.out.println(sortedEmpset);
}
}
