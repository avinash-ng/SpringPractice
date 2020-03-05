package com.spring;

import org.springframework.stereotype.Component;

@Component("seagate")
public class SeagateHDD implements HardDrive{

	@Override
	public String getCompany() {
		
		return "Seagate";
	}
	
}
