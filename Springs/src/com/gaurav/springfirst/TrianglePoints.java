package com.gaurav.springfirst;

public class TrianglePoints {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void drawPoints()
	{
		System.out.println("Triangle Points : [(" + getPointA().getX() + ", " + getPointA().getY()
		+ "), (" + getPointB().getX() + ", " + getPointB().getY()
		+ "), (" + getPointC().getX() + ", " + getPointC().getY() + ")]");
	}
}
