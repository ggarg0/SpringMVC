package com.gaurav.springs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		System.out.println("HelloWorld : ");
		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
		objA.getMessage1();
		objA.getMessage2();

	}
}
