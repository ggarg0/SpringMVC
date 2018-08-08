package com.gaurav.springs;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class HelloWorld implements ApplicationContextAware, BeanNameAware {

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
		System.out.println("World Message2 : " + message2);
	   }

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {

			this.context=context;
		System.out.println("Using ApplicationContextAware : " + context.getApplicationName());
		
	}

	@Override
	public void setBeanName(String bean) {
		System.out.println("Using BeanNameAware : " + bean);
	}

	public void Myinit() throws Exception {
		System.out.println("Bean is going through InitializingBean.");

	}

	public void Mydestroy() throws Exception {
		System.out.println("Bean will destroy by DisposableBean method.");

	}

	
}
