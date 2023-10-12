package com.tut.autowiring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotationautowiring.xml");
		Emp e1 = context.getBean(Emp.class);
		System.out.println(e1);
		
	}
}
