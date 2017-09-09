package com.gaurav.springfirst;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		
	//	BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	
	//	Triangle obj = (Triangle) factory.getBean("triangle");
		Shape obj = (Shape) context.getBean("triangle-alias");
		Shape objConstructor = (Shape) context.getBean("triangle-constructor");
		TrianglePoints objPoints = 
				(TrianglePoints) context.getBean("trianglePoints");
		TriangleCollections objCollections = 
				(TriangleCollections) context.getBean("triangleCollections");
		
		
		
		obj.draw();
		 ((AbstractApplicationContext) context).registerShutdownHook();
		objConstructor.draw();
	//	objPoints.drawPoints();
	//	objCollections.drawPointsFromList();
	}

}
