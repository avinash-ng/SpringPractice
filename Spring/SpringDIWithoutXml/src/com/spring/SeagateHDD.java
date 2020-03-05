package com.spring;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
public class SeagateHDD implements HardDrive{

	@Override
	public String getCompany() {
		
		return "Seagate";
	}
	
}
