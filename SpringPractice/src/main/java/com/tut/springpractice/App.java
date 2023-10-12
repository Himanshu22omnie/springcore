package com.tut.springpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("practice.xml");
       Employee employee = (Employee) context.getBean("Emp");
       Employee employee2 = (Employee) context.getBean("Emp2");
       System.out.println(employee);
       System.out.println(employee2);
    }
}
