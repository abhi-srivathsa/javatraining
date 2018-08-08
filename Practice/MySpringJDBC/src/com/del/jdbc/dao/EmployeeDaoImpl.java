package com.del.jdbc.dao;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import com.del.jdbc.bean.Employee;
@Repository("eDao")
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao  {
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
		jdbcTemplate = getJdbcTemplate();
	
}
//	public EmployeeDaoImpl(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}

	public EmployeeDaoImpl() {
	}

	@Override
	public boolean insertEmp(Employee emp) {
		boolean success = false;
		System.out.println("hello" + emp);
		String query = "insert into emp_spring(id,name,mobile,designation) values(?,?,?,?)";
		Object[] vals = new Object[] { emp.getId(), emp.getName(), emp.getMobile(), emp.getDesignation() };
		int rows = jdbcTemplate.update(query, vals);
		if (rows > 0)
			success = true;
		return success;
	}

	@Override
	public boolean updateEmp(int id, long mobile) {
		boolean success = false;
		String query = "update emp_spring set mobile = ? where id = ?";
		Object[] vals = new Object[] { mobile, id };
		int rows = jdbcTemplate.update(query, vals);
		if (rows > 0)
			success = true;
		return success;
	}

	@Override
	public Employee displayEmp(int id) {
		Employee e = null;
		String query = "select id,name,mobile,designation from emp_spring where id =?";
		e = jdbcTemplate.queryForObject(query, new EmpRowMapper(),id);
		return e;
	}

	@Override
	public List<Employee> displayAll() {
		String sql = "Select id,name,mobile,designation from emp_spring";
		List<Employee> elist = jdbcTemplate.query(sql, new EmpRowMapper());
		return elist;
	}

}
