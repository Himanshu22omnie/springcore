package com.tut.constructorambiguity;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;


public class AdditionRunner {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ambiguity.xml");
		Addition a = context.getBean(Addition.class);
		System.out.println(a);
		a.doSum();
	}
}
