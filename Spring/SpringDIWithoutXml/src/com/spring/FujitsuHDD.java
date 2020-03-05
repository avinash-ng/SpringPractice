package com.spring;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



public class FujitsuHDD implements HardDrive{

	@Override
	public String getCompany() {
		
		return "Fujitsu";
	}

	
}
