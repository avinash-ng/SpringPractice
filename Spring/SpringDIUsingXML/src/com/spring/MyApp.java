package com.spring;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class MyApp {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Project project = (Project) context.getBean("project");
		System.out.println(project.toString());
	}
}
