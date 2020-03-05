package com.springdemo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Russia implements Country{
	
private RequestAPI request;
	
	public Russia(RequestAPI re) {
		request = re;
	}
	
	
	public Map<String, String> getWeather(String city) {
		Map<String, String> map = new HashMap<String, String>();
		try {
			map = request.getWeatherData("Hyderabad");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return map;
		
	}
	
	
}
