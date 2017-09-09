package com.gaurav.AOP.model;

public class Circle {

	private String shape;
	private String name;

	public String getShape() {
		
		return shape;
		
	}

	public void setShape(String shape) {
		this.shape = shape;
		throw(new RuntimeException());
	}
	
	public String getName(String name) {
		return name;
	}
	
}
