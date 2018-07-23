package com.del;

import java.util.Scanner;

public class SumAtPrime {
	public static void main(String[] args) {
		int[] arr = new int[100];
		System.out.println("Enter the number of elements in the array");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("Enter the elements");
		for (int i = 0; i < num; i++) {
			arr[i] = scan.nextInt();
		}
		int sum = PrimeSum(arr);
		System.out.println("The sum of all the elements at prime indices is " + sum);

	}

	private static int PrimeSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isPrime(i)) {
				sum += arr[i];
			}
		}
		return sum;
	}

	private static boolean isPrime(int num) {
		int count = 0;
		if (num == 0 || num == 1)
			return false;
		else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 0) {
				return true;
			} else
				return false;

		}
	}
}
