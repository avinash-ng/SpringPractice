package com.springdemo;
import java.util.HashMap;
import java.util.Map;

public class India implements Country{
	
	private RequestAPI request;
	
	public India(RequestAPI re) {
		this.request = re;
		System.out.println("Hello world\n"+request);
		
	}

	@Override
	public Map<String, String> getWeather(String city) {
		Map<String, String> map = new HashMap<String, String>();
		
		try {
			map = request.getWeatherData(city);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return map;
	}
	
	
}
