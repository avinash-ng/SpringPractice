package com.springdemo;

import java.util.Map;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		India india = (India) context.getBean("India");
//		System.out.println(india);
//		Test test = (Test) context.getBean("test");
//		test.check();
		
		China china = (China) context.getBean("China");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Map<String, String> answer = china.getWeather(s);
		System.out.println(s +" weather data is "+" \n "+answer);
		
		
	}
}