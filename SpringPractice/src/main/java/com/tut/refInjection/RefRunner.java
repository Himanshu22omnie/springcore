package com.tut.refInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefRunner {
		public static void main(String[] args) {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("reference.xml");
			
			First f = (First)context.getBean("firstClass");
			System.out.println(f);
			System.out.println(f.getOb().getB());
			
		}
}
