package com.del;

public class Subtract extends Arithmetic {

	@Override
	public void calculate(int num1, int num2) {
		int num3 = num1 - num2;
		super.setNum3(num3);
	}

}
