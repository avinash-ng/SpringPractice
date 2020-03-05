package com.spring;

import org.springframework.stereotype.Component;

@Component("hitachi")
public class HitachiHDD implements HardDrive{

	@Override
	public String getCompany() {
		
		return "Hitachi";
	}
	

}
