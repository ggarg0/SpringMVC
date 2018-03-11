package com.gaurav.junit;

import org.springframework.stereotype.Component;

@Component
public class EmpBusinessLogic {
	
	public int calculateYearlySalary(EmployeeDetails employeeDetails){
		   int yearlySalary=0;
	      yearlySalary = employeeDetails.getMonthlySalary() * 12;
	      return yearlySalary;
	   }
	
	   public int calculateAppraisal(EmployeeDetails employeeDetails){
		   int appraisal=0;
	      if(employeeDetails.getMonthlySalary() < 10000){
	         appraisal = 500;
	      }else{
	         appraisal = 1000;
	      }
	      return appraisal;
	   }
	}