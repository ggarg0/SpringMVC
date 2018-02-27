package com.gaurav.springfirst;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	
		System.out.println("From  TriangleObj: ");
		Triangle TriangleObj = (Triangle) context.getBean("triangle");
		TriangleObj.draw();
		
		System.out.println("From  shapeObj: ");
		Shape shapeObj = (Shape) context.getBean("triangle-alias");
		shapeObj.draw();
		
		System.out.println("From  shapeObjConstructor: ");
		Shape shapeObjConstructor = (Shape) context.getBean("triangle-constructor");
		shapeObjConstructor.draw();
		
		System.out.println("From  trianglePointsObject: ");
		TrianglePoints trianglePointsObject = 
				(TrianglePoints) context.getBean("trianglePoints");
		trianglePointsObject.drawPoints();
		
		System.out.println("From  triangleCollectionsObj: ");
		TriangleCollections triangleCollectionsObj = 
				(TriangleCollections) context.getBean("triangleCollections");	
		triangleCollectionsObj.drawPointsFromList();
				
		 ((AbstractApplicationContext) context).registerShutdownHook();	
	}
}
