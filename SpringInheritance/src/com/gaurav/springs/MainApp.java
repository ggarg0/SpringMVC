package com.gaurav.springs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	 public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

	    /*  HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

	      objA.getMessage1();
	      objA.getMessage2();*/

	      HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
	      
	      objB.getMessage1();
	      objB.getMessage2();
	      objB.getMessage3();
	      
	      Triangle objTriangle1 = (Triangle) context.getBean("triangle1");
	      Triangle objTriangle2 = (Triangle) context.getBean("triangle2");
	      objTriangle1.drawPointsFromList();
	      objTriangle2.drawPointsFromList();
	   }
}
