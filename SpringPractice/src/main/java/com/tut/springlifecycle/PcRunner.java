package com.tut.springlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class PcRunner {
	public static void main(String[] args) {
		AbstractApplicationContext Context = new ClassPathXmlApplicationContext("lifecycle.xml");
//		PC p = (PC)Context.getBean("pc");
//		System.out.println(p);
		Context.registerShutdownHook();  //destroy method call krane k liye
		
		
		
		// Using Annotations
		
		PcUsingAnnotations p2 = (PcUsingAnnotations) Context.getBean("pcanno");
		System.out.println(p2);
		
	}
}
  