package com.del.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.del.exception.BankingException;
import com.del.service.BankingService;
import com.del.service.BankingServiceImpl;

public class BankingClient {
	private BankingService bService;

	public BankingClient() {
		bService = new BankingServiceImpl();
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		while (true) {
			try {
				choice = getChoice(scan);
			} catch (InputMismatchException e) {
				System.err.println("Please enter a number");
				scan.nextLine();
			}
			switch (choice) {
			case 1:
				double amount =0.0;
				System.out.println("DEPOSIT AMOUNT");
				System.out.println("Enter the amount ot be deposited");
				try {
					  amount = scan.nextDouble();
					bService.depositAmount(amount);
				} catch (BankingException e) {
					System.out.println(e.getMessage());
				}catch (InputMismatchException e) {
					// TODO: handle exception
					System.err.println("Enter number only");
					 scan.nextLine();
				}

				break;
			case 2:
				System.out.println("WITHDRAW AMOUNT");
				System.out.println("Enter the amount to be withdrawn");
				double amountWithdrawn = 0.0;
				double amount1=0.0;
				try {
					 amount1 = scan.nextDouble();
					amountWithdrawn = bService.withdrawAmount(amount1);
				} catch (BankingException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}catch (InputMismatchException e) {
					// TODO: handle exception
					System.err.println("Enter number only");
					scan.nextLine();
				}

				System.out.println("Withdrawn amount is : " + amountWithdrawn);
				break;
			case 3:
				System.out.println("CHECK BALANCE");
				double balance = bService.checkBalance();
				System.out.println("The Balance is " + balance);
				break;
			case 4:
				System.out.println("Exiting... Thank you.");
				System.exit(0);
				break;
			default:
				System.out.println("Enter the correct choice");
				break;
			}
		}
	}

	private int getChoice(Scanner scan) {
		int choice = 0;
		System.out.println("BANKING SYSTEM");
		System.out.println("1.Deposit amount \n 2. Withdraw amount \n 3.Check balance \n 4. Quit program");
		System.out.println("Enter a choice from 1 to 4");
		choice = scan.nextInt();
		return choice;

	}

	public static void main(String[] args) {
		new BankingClient();
	}

}
