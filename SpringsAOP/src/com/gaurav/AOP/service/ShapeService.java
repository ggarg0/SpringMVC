package com.gaurav.AOP.service;

import com.gaurav.AOP.model.Circle;
import com.gaurav.AOP.model.Triangle;

public class ShapeService {

	private Circle circle;
	private Triangle triangle;
	
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
}
