package com.gaurav.springfirst;

import java.util.List;

public class TriangleCollections {

	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void drawPointsFromList()
	{
		for(Point point : points)
		System.out.println("Triangle Points from list : [(" + point.getX() + ", " + point.getY() + ")]");
	
	}
}
