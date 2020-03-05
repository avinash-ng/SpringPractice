package com.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		
		EmployeeDao empd =  (EmployeeDao) context.getBean("empDao");
		System.out.println(empd.getEmployeeWithId(1));
		List<Employee> list = empd.getEmployeesWithAge(20);
		for(Employee emp : list) {
			System.out.println(emp);
		}
		
		
	}
}
