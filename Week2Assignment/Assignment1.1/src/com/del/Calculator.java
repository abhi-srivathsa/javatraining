package com.del;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		Arithmetic[] arr = { new Add(), new Subtract(), new Multiply(), new Division() };
		System.out.println("Enter the choice : \n 1.Add \n 2.Subtract\n 3.Multiply \n 4.Division");
		choice = scan.nextInt();
		arr[choice - 1].read();
		arr[choice - 1].calculate(arr[choice - 1].getNum1(), arr[choice - 1].getNum2());
		arr[choice - 1].display();

	}
}
