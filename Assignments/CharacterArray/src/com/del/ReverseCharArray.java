package com.del;

import java.util.Collections;

public class ReverseCharArray {

	public static void main(String[] args) {
		char[] cArr = { 'B', 'U', 'H', 'D', 'I', 'U', 'Q', 'I', 'L' };
		System.out.println("The characters of the array are");
		for (int k = 0; k <=cArr.length - 1; k++) {
			System.out.print(cArr[k]);
		}
		System.out.println("\nThe characters of the array in reverse order are");
		for (int k = cArr.length-1; k >=0; k--) {
			System.out.print(cArr[k]);
		}
	}
}
