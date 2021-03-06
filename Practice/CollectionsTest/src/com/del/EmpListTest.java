package com.del;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class EmpListTest {

	public static void main(String[] args) {
		List<Emp> EmployeeList = new ArrayList<>();
		EmployeeList.add(new Emp(111, "Rohit", 9012131131L));
		EmployeeList.add(new Emp(131, "Harsh", 9443652452L));
		EmployeeList.add(new Emp(123, "Priyanka", 9345353124L));
		EmployeeList.add(new Emp(143, "Debarati", 9257756312L));
		EmployeeList.add(new Emp(175, "Nikhil", 9512135656L));
		System.out.println(EmployeeList);
		System.out.println("enter the type of sort : \n 1.id \n 2.name \n3.mobile");
		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();
		// switch case to be added
		// Collections.sort(EmployeeList, new EmpComparator(SortingField.Id ));
//		Collections.sort(EmployeeList, new Comparator<Emp>() {
//			@Override
//			public int compare(Emp e1, Emp e2) {
//				return e1.getId() - e2.getId();
//			}
//		});
		Collections.sort(EmployeeList, (e1,e2)->e1.getId()-e2.getId());
		System.out.println(EmployeeList);
	}

}
