package com.del.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.del.jdbc.bean.Employee;
import com.del.jdbc.dao.EmployeeDao;
@Service("service")
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDao eDao;

public EmployeeServiceImpl() {
}
	public EmployeeServiceImpl(EmployeeDao eDao) {
	this.eDao = eDao;
}
	@Override
	public boolean insertEmp(Employee emp) {
		return eDao.insertEmp(emp);
	}
	@Override
	public boolean updateEmp(int id, long mobile) {
		return eDao.updateEmp(id,mobile);
	}
	@Override
	public Employee displayEmp(int id) {
       return eDao.displayEmp(id);
	}
	@Override
	public List<Employee> displayAll() {
		
		return eDao.displayAll();
	}

}
