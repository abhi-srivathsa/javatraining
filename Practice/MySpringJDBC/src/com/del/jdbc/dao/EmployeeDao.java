package com.del.jdbc.dao;

import java.util.List;

import com.del.jdbc.bean.Employee;

public interface EmployeeDao {

	boolean insertEmp(Employee emp);

	boolean updateEmp(int id, long mobile);

	Employee displayEmp(int id);

	List<Employee> displayAll();



}
