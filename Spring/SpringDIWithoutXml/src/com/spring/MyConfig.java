package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration

public class MyConfig {
	
	@Bean(name = "hitachi")
	public HitachiHDD hitachiHDD() {
		return new HitachiHDD();
	}
	
	@Bean(name = "fujitsu")
	public FujitsuHDD fujitsuHDD() {
		return new FujitsuHDD();
	}
	
	@Bean(name = "seagate")
	public SeagateHDD seagateHDD() {
		return new SeagateHDD();
	}
	
	@Bean
	public Laptop laptop() {
		return new Laptop();
	}

	
}
