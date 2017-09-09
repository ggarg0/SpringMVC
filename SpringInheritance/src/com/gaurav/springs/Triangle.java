package com.gaurav.springs;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.gaurav.springs.Point;

public class Triangle implements ApplicationContextAware, BeanNameAware{

	private List<Point> points;
	 private ApplicationContext context = null;
	 private String beanName = null;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void drawPointsFromList()
	{
		for(Point point : points)
		System.out.println("Triangle Points from " + beanName + " list "
				+ " : [(" + point.getX() + ", " + point.getY() + ")]");
	
	}

	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
		
	}

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
			this.context=context;
		
	}
}
