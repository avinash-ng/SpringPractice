package com.spring;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setId(arg0.getInt("id"));
		emp.setName(arg0.getString("name"));
		emp.setAge(arg0.getInt("age"));
		return emp;
	}

}
