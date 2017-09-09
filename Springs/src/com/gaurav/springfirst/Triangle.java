package com.gaurav.springfirst;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean, Shape{

	private int length;
	private String type;
	
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void draw()
	{
		System.out.println("Triangle of type : " + getType() 
				+ " and length : " + getLength());
	}
	
	 public void Myinit(){
	      System.out.println("Bean is going through Myinit.");
	   }
	   public void Mydestroy(){
	      System.out.println("Bean will destroy now by Mydestroy.");
	   }

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean is going through InitializingBean.");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Bean will destroy by DisposableBean method.");
		
	}

	
}
