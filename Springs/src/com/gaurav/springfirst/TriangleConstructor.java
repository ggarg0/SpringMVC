package com.gaurav.springfirst;

public class TriangleConstructor implements Shape{

	private int length;
	private String type;
	
	public TriangleConstructor(String type)
	{
		this.type=type;
	}
	
	public TriangleConstructor(String type, int length)
	{	
		this.type=type;
		this.length=length;
	}
	
	
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
		System.out.println("Triangle (Constructor) of type : " + getType() 
				+ " and length : " + getLength());
	}
	
}
