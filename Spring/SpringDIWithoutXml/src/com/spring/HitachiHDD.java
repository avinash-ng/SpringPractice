package com.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class HitachiHDD implements HardDrive{

	@Override
	public String getCompany() {
		
		return "Hitachi";
	}
	

}
