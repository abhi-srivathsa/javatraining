package com.del;

public class DivisorsOfFifty {
	public static void main(String[] args) {
		int n = 50;
		System.out.println(" The divisors of 50 are");
		for (int i = 1; i <= n ; i++) {
			if (n% i == 0)
				System.out.print(i +", ");
		}
	}
}
