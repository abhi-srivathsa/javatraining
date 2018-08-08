package com.del.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.del.jdbc.bean.Employee;

public class EmpRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		return new Employee(rs.getInt(1), rs.getString(2), rs.getLong(3), rs.getString(4));
	}

}
