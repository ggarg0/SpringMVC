package com.gaurav.springs;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class HelloWorld implements ApplicationContextAware{

	private String message1;
	private String message2;
	private ApplicationContext context = null;

	   public void setMessage1(String message){
	      this.message1  = message;
	   }

	   public void setMessage2(String message){
	      this.message2  = message;
	   }

	   public void getMessage1(){
	      System.out.println("World Message1 : " + message1);
	   }

	   public void getMessage2(){
	      System.out.println("World Message2 : " + message2 + " and context : " + context.getDisplayName());
	   }

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {

			this.context=context;
		
	}
	
}
