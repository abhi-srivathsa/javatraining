package com.del.jdbc.client;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.del.jdbc.bean.Employee;
import com.del.jdbc.service.EmployeeService;

@ComponentScan("com.del.jdbc")
@EnableAutoConfiguration

public class EmployeeClient {
	

	public EmployeeClient() {
		
	}

	private static int getChoice() {
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Emp Management System");
		System.out.println(
				"1.Insert Emp record \n 2. Display Emp record \n 3.Update Emp record\n 4.Delete Emp record\n 5.Display all employees \n 6.Quit program");
		System.out.println("Enter a choice from 1 to 5");
		choice = scan.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		EmployeeService eService;
		System.setProperty("spring.profiles.active", "prod");
		ApplicationContext ctx = SpringApplication.run(EmployeeClient.class);
				//new ClassPathXmlApplicationContext("spring.xml");
		eService = (EmployeeService) ctx.getBean("service");
		int choice = 0;
		System.out.println("Welcome to EMPLOYEE MANAGEMENT SYSTEM");
		choice = getChoice();
		switch (choice) {
		case 1:
			System.out.println("Insert EMP");
			System.out.println("Enter <id> <name> <mobile> <designation>");
			Scanner scan = new Scanner(System.in);
			Employee emp = new Employee(scan.nextInt(), scan.next(), scan.nextLong(), scan.next());
			boolean success = eService.insertEmp(emp);
			if (success)
				System.out.println("Row inserted");
			else
				System.out.println("Unable to inserted");

			break;
		case 2:
			System.out.println("Display EMP");
			System.out.println("Enter id of employee to display");
			Scanner scan3 = new Scanner(System.in);
			int id2 = scan3.nextInt();
			Employee e = eService.displayEmp(id2);
			System.out.println(e);

			break;
		case 3:
			System.out.println("Update EMP");
			System.out.println("Enter <id> and new <mobile number>");
			Scanner scan2 = new Scanner(System.in);
			int id = scan2.nextInt();
			long mobile = scan2.nextLong();
			boolean success2 = eService.updateEmp(id,mobile);
			if (success2)
				System.out.println("Row updated");
			else
				System.out.println("Unable to update");

			break;
		case 4:
			System.out.println("Delete EMP");

			break;
		case 5:
			System.out.println("Display all employees.");
			List<Employee> list = eService.displayAll();
			System.out.println(list);

			break;
		case 6:
			System.out.println("Exiting....");

			break;
		default:
			break;
		}
	}
}
