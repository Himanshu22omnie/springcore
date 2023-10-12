package com.tut.ConfigWithoutXml.withoutComponent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class JavaConfig {
	
	@Bean
	public Employee getStudent() {	
		Employee employee = new Employee(getPrice()); // Here we have to return so this is for return.
		return employee;
	}
	
	@Bean
	public Lappy getPrice() {	
		Lappy l = new Lappy(); // Here we have to return so this is for return.
		return l;
	}
}