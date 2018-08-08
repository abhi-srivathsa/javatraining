package com.del.jdbc.service;

import java.util.List;

import com.del.jdbc.bean.Employee;

public interface EmployeeService {

	boolean insertEmp(Employee emp);

	boolean updateEmp(int id, long mobile);

	Employee displayEmp(int id);

	List<Employee> displayAll();
	

}
