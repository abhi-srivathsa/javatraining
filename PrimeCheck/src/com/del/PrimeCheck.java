package com.del;

import java.util.Scanner;

public class PrimeCheck {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = scan.nextInt();
	boolean test = prime(num);
	if(test) {
		System.out.println(num+" is a Prime number");
}
	else
		System.out.println(num+" is not a prime");
}

private static boolean prime(int num) {
int count =0;
	for (int i = 2; i <= num/2; i++) {
		if(num%i==0) {
		count++;
		}
	}
		if(count == 0) {
			return true;
	}
	else
		return false;
		
	}
}

