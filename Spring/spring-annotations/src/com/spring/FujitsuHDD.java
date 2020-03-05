package com.spring;

import org.springframework.stereotype.Component;

@Component("fujitsu")
public class FujitsuHDD implements HardDrive{

	@Override
	public String getCompany() {
		
		return "Fujitsu";
	}

	
}
