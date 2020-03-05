package com.springdemo;

import java.io.IOException;

public class Test {

	public void check() {
		System.out.println("test");
		 RequestAPI request = new RequestAPI();
		 try {
			request.getWeatherData("Hyderabad");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
