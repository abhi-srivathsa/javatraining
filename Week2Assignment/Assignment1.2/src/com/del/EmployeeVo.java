package com.del;
public class EmployeeVo {
	private int EmpId;
	private String EmpName;
	private double AnnualIncome;
	private double IncomeTax;

	public EmployeeVo() {
		super();
		
	}

	@Override
	public String toString() {
		return "EmployeeVo [EmpId=" + EmpId + ", EmpName=" + EmpName + ", AnnualIncome=" + AnnualIncome + ", IncomeTax="
				+ IncomeTax + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(AnnualIncome);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + EmpId;
		result = prime * result + ((EmpName == null) ? 0 : EmpName.hashCode());
		temp = Double.doubleToLongBits(IncomeTax);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeVo other = (EmployeeVo) obj;
		if (Double.doubleToLongBits(AnnualIncome) != Double.doubleToLongBits(other.AnnualIncome))
			return false;
		if (EmpId != other.EmpId)
			return false;
		if (EmpName == null) {
			if (other.EmpName != null)
				return false;
		} else if (!EmpName.equals(other.EmpName))
			return false;
		if (Double.doubleToLongBits(IncomeTax) != Double.doubleToLongBits(other.IncomeTax))
			return false;
		return true;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public double getAnnualIncome() {
		return AnnualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		AnnualIncome = annualIncome;
	}

	public double getIncomeTax() {
		return IncomeTax;
	}

	public void setIncomeTax(double incomeTax) {
		IncomeTax = incomeTax;
	}

}
