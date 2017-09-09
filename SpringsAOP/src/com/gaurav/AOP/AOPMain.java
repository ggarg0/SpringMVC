package com.gaurav.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.gaurav.AOP.service.ShapeService;

public class AOPMain {

	public static void main(String[] args) {
	
		  ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		  ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
		
		  System.out.println("Triangle : " + shapeService.getTriangle().getShape());
		  System.out.println("Circle : " + shapeService.getCircle().getShape());
		  System.out.println("Circle : " + shapeService.getCircle().getName("Gaurav From Main"));
		  
		  shapeService.getCircle().setShape("Gaurav");
	}

}
