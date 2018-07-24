package com.del;

public class SquareOfPrime {

	public static void main(String[] args) {
		int i=1,square = 0;
		while(square < 900) {
			if(isPrime(i++)) {
				square = i*i;
				System.out.println("The square of "+i+" is "+ i*i );
			}
		}

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
