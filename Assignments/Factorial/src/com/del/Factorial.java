package com.del;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Factorial f = new Factorial();
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int a = scan.nextInt();
	int res = f.fact(a);
	System.out.println(res);
}

private int fact(int a) {
	if(a==0) 
		return 1;
	else if(a==1)
		return 1;
	else
		return a * fact(a-1);
	}
}
