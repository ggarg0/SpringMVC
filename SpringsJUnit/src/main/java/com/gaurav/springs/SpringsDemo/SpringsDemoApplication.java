package com.gaurav.springs.SpringsDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.gaurav.junit.EmpBusinessLogic;
import com.gaurav.junit.EmployeeDetails;

@Configuration
@ComponentScan({"com.gaurav.junit"})
public class SpringsDemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringsDemoApplication.class, args);
		try (AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringsDemoApplication.class)) {

			EmpBusinessLogic empLogic = 
					applicationContext.getBean(EmpBusinessLogic.class);
			EmployeeDetails emp = 
					applicationContext.getBean(EmployeeDetails.class);

			System.out.println(empLogic.calculateYearlySalary(emp.getEmployee()));
			//System.out.println(componentJDBC);
		}
		
	}
}
