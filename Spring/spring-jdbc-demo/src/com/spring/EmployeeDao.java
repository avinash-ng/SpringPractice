package com.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;


	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public void insertEmployee(Employee emp) {
		String query = "insert into Employee (id, name, age) " + "values(" + emp.getId()+",\""+ emp.getName() +"\","+ emp.getAge() +")";
//		String query = "insert inro Employee values (?, ?, ?)";
		
		jdbcTemplate.update(query);
	}
	
	public void updateEmployeeAge(Employee emp, int age) {
		String query = "update Employee set emp.age() = "+ age;
		jdbcTemplate.update(query);
	}
	
	public void deleteEmployee(Employee emp ) {
		String query = "delete from Employee where id = "+emp.getId();
		jdbcTemplate.batchUpdate(query);
	}
	
	public Employee getEmployeeWithId(int id) {
		String sql = "select * from Employee where id="+id;
		return jdbcTemplate.queryForObject(sql, new EmployeeMapper());
	}
	
	public List<Employee> getEmployeesWithAge(int age) {
		String sql = "select * from Employee where age = 20";
		return jdbcTemplate.query(sql, new EmployeeMapper());
	}

}
