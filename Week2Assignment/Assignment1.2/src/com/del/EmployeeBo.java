package com.del;

public class EmployeeBo {
	public void CalincomTax(EmployeeVo e) {
		if (e.getAnnualIncome() < 250000) {
			e.setIncomeTax(0);
		} else if (e.getAnnualIncome() >= 250000 && e.getAnnualIncome() < 500000) {
			e.setIncomeTax(0.10 * e.getAnnualIncome());
		} else if (e.getAnnualIncome() >= 500000 && e.getAnnualIncome() < 1000000) {
			e.setIncomeTax(0.20 * e.getAnnualIncome());
		} else {
			e.setIncomeTax(0.30 * e.getAnnualIncome());
		}
	}
}
