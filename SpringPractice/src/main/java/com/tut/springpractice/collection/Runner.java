package com.tut.springpractice.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
		Student stu = (Student)context.getBean("student");
		System.out.println(stu);
		System.out.println(stu.getName());
	}
}
