package com.tut.ConfigWithoutXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
	ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfig.class);
	Employee emp = (Employee) con.getBean("employee");
	System.out.println(emp);
	emp.study();
	
	
	}
}
