package com.gaurav.annotations;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import com.gaurav.annotations.Point;

public class Triangle implements Shape{

	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}
	
	@Autowired  //mapping with property name in spring.xml
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	
	@Autowired
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getpointC() {
		return pointC;
	}
	
	@Resource(name="pointTwo") // Direct mapping with bean id in spring.xml
	public void setpointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw()
	{
		System.out.println("Triangle Points : [(" + getPointA().getX() + ", " + getPointA().getY()
		+ "), (" + getPointB().getX() + ", " + getPointB().getY()
		+ "), (" + getpointC().getX() + ", " + getpointC().getY() + ")]");
	}
	
	
}
