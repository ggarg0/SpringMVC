package com.gaurav.springs;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class HelloIndia implements ApplicationContextAware, BeanNameAware{

	 private String message1;
	   private String message2;
	   private String message3;
	   private ApplicationContext context = null;
	   

	   public void setMessage1(String message){
	      this.message1  = message;
	   }

	   public void setMessage2(String message){
	      this.message2  = message;
	   }

	   public void setMessage3(String message){
	      this.message3  = message;
	   }

	   public void getMessage1(){
	      System.out.println("India Message1 : " + message1);
	   }

	   public void getMessage2(){
	      System.out.println("India Message2 : " + message2);
	   }

	   public void getMessage3(){
	      System.out.println("India Message3 : " + message3);
	   }

	@Override
	public void setBeanName(String bean) {
		System.out.println("Using BeanNameAware : " + bean);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {

		this.context=context;
		System.out.println("Using ApplicationContextAware : " + context.getId().toString());		
	}
}
