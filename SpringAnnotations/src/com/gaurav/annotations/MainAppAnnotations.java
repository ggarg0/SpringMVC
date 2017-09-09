package com.gaurav.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainAppAnnotations {

	public static void main(String[] args) {
		  ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		    /*  HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

		      objA.getMessage1();
		      objA.getMessage2();*/
		  	((AbstractApplicationContext) context).registerShutdownHook();
		      Shape obj = (Shape) context.getBean("triangle");
		      obj.draw();
		      
		      // @Required annotation and org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor
		      obj = (Shape)  context.getBean("circle");
		      obj.draw();
		      System.out.println("MessageSource message : " + 
		      context.getMessage("greeting",null,"Default message",null));
	}

}
