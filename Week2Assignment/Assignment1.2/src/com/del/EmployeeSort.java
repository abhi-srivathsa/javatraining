package com.del;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeSort implements Comparator<EmployeeVo>{

	@Override
	public int compare(EmployeeVo o1, EmployeeVo o2) {
		
		return (int) (o2.getIncomeTax()-o1.getIncomeTax());
	}



	
}
