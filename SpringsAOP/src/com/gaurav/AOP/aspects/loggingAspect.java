package com.gaurav.AOP.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class loggingAspect {

	@Before("execution(public String com.gaurav.AOP.model.Circle.getShape())")
	public void loggingAdvice()
	{
		System.out.println("Advice run. (public String com.gaurav.AOP.model.Circle.getShape())");
	}
	
	@Before("allModelMethods() && allGettersWithArguments()")
	public void loggingCircleAdvice()
	{
		System.out.println("Advice run . allModelMethods && allGettersWithArguments called");
	}
	
	//get*(..) -- for zero or more arguments
	//get*()  --  for No Arguments
	//get*(*) -- for one or more arguments
	@Before("allGettersWithArguments()")
	public void loggingAdviceWildCard()
	{
		System.out.println("Advice run. allGettersWithArguments");
	}
	
	
	@Before("allGettersWithNoArguments()")
	public void loggingAdviceWildCard1(JoinPoint join)
	{
		System.out.println("Advice run allGettersWithNoArguments() with join point : " +  join.toString());
	}
	
	//@Before("args(String)")
	@After("args(name)")
	public void stringArgMethod(String name)
	{
		System.out.println("After Advice run for method which takes " + name.toString() +" as an argument.");
	}
	
	@AfterReturning(pointcut="args(name)", returning="returnString")
	public void stringArgMethod1(String name, String returnString)
	{
		System.out.println("AfterReturning Advice run for method which takes " + name.toString() +" as an argument"
				+ " and output as " + returnString.toString());
	}
	
	@AfterThrowing(pointcut="args(name)", throwing="ex")
	public void stringArgMethod2(String name, RuntimeException ex)
	{
		System.out.println("@AfterThrowing Advice run for exception : " + ex);
	}
	
	@Pointcut("execution(public * get*(*))")
	public void allGettersWithArguments()
	{}
	
	@Pointcut("execution(public * get*())")
	public void allGettersWithNoArguments()
	{}
	

	@Pointcut("within(com.gaurav.AOP.model.*)")
	public void allModelMethods()
	{}
	
	//@Pointcut(args())
	//public void allArgsMethod(){}
	
}
