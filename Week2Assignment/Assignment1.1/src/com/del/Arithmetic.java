package com.del;

import java.util.Scanner;

public abstract class Arithmetic {
	private int num1, num2, num3;

	public void read() {
		System.out.println("enter two numbers :");
		Scanner sc = new Scanner(System.in);
		this.setNum1(sc.nextInt());
		this.setNum2(sc.nextInt());
	}

	public void display() {
		System.out.println("The result is " + num3);
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public Arithmetic() {
		super();

	}

	abstract public void calculate(int num1, int num2);
}
