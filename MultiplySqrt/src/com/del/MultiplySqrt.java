package com.del;

import java.util.Scanner;

public class MultiplySqrt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		NumberUtil num = new NumberUtil();
		while (true) {
			System.out.println("Enter the arithmetic operation to be performed \n 1.Multiply \n 2.Squareroot \n 3.Exit");
			int choice = scan.nextInt();
			if (choice == 1) {
				System.out.println("Enter the first number");
				int a = scan.nextInt();
				System.out.println("Enter the second number");
				int b = scan.nextInt();
				int res = num.multiply(a, b);
				System.out.println("The product of " + a + " and " + b + " is " + res);
			} else if (choice == 2) {
				System.out.println("Enter the number");
				double a = scan.nextDouble();
				double res = num.squareroot(a);
				System.out.println(" The Square root of " + a + " is " + res);

			} else if (choice == 3) {
				System.exit(0);
			} else {
				System.out.println("Invalid option ");
			}
		}
	}

}
