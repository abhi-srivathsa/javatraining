package com.del.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.del.exception.MobileException;
import com.del.service.MobileService;
import com.del.service.MobileServiceImpl;

public class MobileClient {
	private MobileService bService;

	public MobileClient() {
		bService = new MobileServiceImpl();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Mobile Number : ");
		String user = scan.nextLine();
		System.out.println("Enter password : ");
		String password = scan.nextLine();
		boolean auth = bService.authenticate(user, password);
		if (auth) {
			int choice = 0;
			double pending = bService.checkBalance();
			System.out.println("The Pending amount for " + user + " is " + pending);
			while (true) {
				try {
					choice = getChoice(scan);
				} catch (InputMismatchException e) {
					System.err.println("Please enter a number");
					scan.nextLine();
				}
				switch (choice) {
				case 1:
					double amount = 0.0;
					System.out.println("Pay Bill");
					System.out.println("Enter the amount to be paid");
					try {
						amount = scan.nextDouble();
						bService.depositAmount(amount);
					} catch (MobileException e) {
						System.out.println(e.getMessage());
					} catch (InputMismatchException e) {
						// TODO: handle exception
						System.err.println("Enter number only");
						scan.nextLine();
					}

					break;
				case 2:
					System.out.println("CHECK STATUS");
					double balance = bService.checkBalance();
					if (balance > 0)
						System.out.println("The Pending amount for " + user + " is " + balance);
					else
						System.out.println("The extra amount already paid for " + user + " is " + (-balance));
					break;
				case 3:
					System.out.println("Exiting... Thank you.");
					System.exit(0);
					break;
				default:
					System.out.println("Enter the correct choice");
					break;
				}
			}
		} else {
			System.out.println("Invalid Username or password! ");
		}
	}

	private int getChoice(Scanner scan) {
		int choice = 0;
		System.out.println("Mobile SYSTEM");
		System.out.println("1.Pay bill  \n2.Check Status \n3.Quit program");
		System.out.println("Enter a choice from 1 to 3");
		choice = scan.nextInt();
		return choice;

	}

	public static void main(String[] args) {
		new MobileClient();
	}

}
