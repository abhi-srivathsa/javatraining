package com.del;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter array size");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		int i;
		boolean b=false;
		for(i=0;i<n;i++)
		{ System.out.println("Enter value at index: "+i);
		 arr[i]=scan.nextInt();
		}
		b=UserMainCode.checktriplets(arr);
		System.out.println(b);

		
		
	}

}
