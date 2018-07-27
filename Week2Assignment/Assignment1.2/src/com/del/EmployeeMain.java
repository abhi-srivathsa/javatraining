package com.del;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of employees");
		int number = scan.nextInt();
		EmployeeVo[] array = new EmployeeVo[number];
		EmployeeBo a = new EmployeeBo();
		for (int i = 0; i < array.length; i++) {
			array[i] = new EmployeeVo();
			System.out.println("Enter emp id for employee - " + i);
			array[i].setEmpId(scan.nextInt());
			System.out.println("Enter emp name for employee - " + i);
			array[i].setEmpName(scan.next());
			System.out.println("Enter annaual income for employee - " + i);
			array[i].setAnnualIncome(scan.nextDouble());
			a.CalincomTax(array[i]);
		}
		System.out.println("The details of all the employees are ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
Arrays.sort(array,new EmployeeSort());
for (int i = 0; i < array.length; i++) {
	System.out.println(array[i]);
}
	}

}
