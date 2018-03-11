package com.gaurav.onlyAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
public class MainCallingClass {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(MainCallingClass.class)) {

			ComponentDAO component = 
					applicationContext.getBean(ComponentDAO.class);
			ComponentJdbcConnection componentJDBC = 
					applicationContext.getBean(ComponentJdbcConnection.class);

			System.out.println(component);
			System.out.println(componentJDBC);
		}
	}
}
