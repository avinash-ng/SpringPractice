package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@ComponentScan(basePackages = {"com.spring"})
public class Laptop {
	
	
	
//	@Autowired
//	@Qualifier("seagate")
	HardDrive obj;
	
	
	Laptop(){
		System.out.println("inside laptop constructor");
	}
	
	
	/*
	 * constructor injection using annotation
	Laptop(@Qualifier("hitachi") HardDrive ob){
		obj = ob;
		System.out.println("Hi hello");
	}
	*/
	
	
	
	public HardDrive getObj() {
		return obj;
	}


	/*
	 * setter injection using annotation
	*/
	@Autowired
	@Qualifier("fujitsu")
	public void setObj(HardDrive obj) {

		this.obj = obj;
	}
	

	
	public String toString(){
		return "Laptop made with " + getObj().getCompany() +" harddrive ";		
	}


	
	

}
