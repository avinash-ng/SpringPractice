package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		Laptop lap = (Laptop) context.getBean("laptop");
		Laptop lap = (Laptop) context.getBean("laptop");
		System.out.println(lap.toString());
		 

	}

}
