package com.springdemo;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;


class RequestAPI {
	// 4a42ff626ac8b54770faff497189e466
	private String apiKey = "b178f766b3536c7d4f210281154cf6f5";
	
	public Map<String, String> getWeatherData(String city) throws IOException {
		String url = "http://api.openweathermap.org/data/2.5/weather?q=" +city+"&appid=" + apiKey ;
		URL u = new URL(url);
		HttpURLConnection con = (HttpURLConnection) u.openConnection();
//		con.setRequestMethod("GET");
//		con.setRequestProperty("Accept", "application/json");
        
		if(con.getResponseCode() != 200) {
			return new HashMap<String, String>();
			
		}
		
		BufferedReader bReader = new BufferedReader(new InputStreamReader(con.getInputStream()));
		ObjectMapper mapper = new ObjectMapper();
		Map<String, String> map = mapper.readValue(bReader.readLine(), Map.class); 
		
		
		
		return map;
		
	}
}

