package com.tut.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsRunner {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ConstructorInjection.xml");
		Person bean = (Person)context.getBean("per");
		System.out.println(bean);
	}
}