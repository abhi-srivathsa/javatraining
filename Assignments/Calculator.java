package calculator;

import java.util.Scanner;

public class Calculator {
	private static void divide(int a, int b) {
		System.out.println("The quotient of " + a + " and " + b + " is " + (a / b));

	}

	private static void multiply(int a, int b) {
		System.out.println("The product of " + a + " and " + b + " is " + (a * b));
	}

	private static void subtraction(int a, int b) {
		System.out.println("The difference of " + a + " and " + b + " is " + (a - b));
	}

	private static void addition(int a, int b) {
		System.out.println("The sum of " + a + " and " + b + " is " + (a + b));

	}

	public static void main(String[] args) {
		boolean k = true;
		System.out.println(" Calculator ");
		while (k) {
			System.out.println("Enter two numbers: ");

			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println("enter arithmetic operation to perform: ");
			System.out.println("1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n 5.Exit");
			int c = scan.nextInt();
			switch (c) {
			case 1:
				addition(a, b);
				break;
			case 2:
				subtraction(a, b);
				break;
			case 3:
				multiply(a, b);
				break;
			case 4:
				divide(a, b);
				break;
			case 5:
				k = false;
				break;
			default:
				System.out.println("Not an option");
				break;
			}
		}
	}

}
