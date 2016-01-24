package com.vinod.test.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class MyObserver {

	/**
	 * 
	 * This method will execute before executing any method in side
	 * com.vinod.test.aop package
	 * 
	 */

	@Before("execution(* com.vinod.test.aop.*.*(..))")
	public void beforeAdvice(JoinPoint jp) {
		System.out.println("Creating  object" + jp.getTarget().getClass().getName());
	}

	/**
	 * This method will execute after executing any method
	 * 
	 */
	@After("execution(* com.vinod.test.aop.*.*(..))")
	public void afterAdvice(JoinPoint jp) {
		System.out.println("Created  object" + jp.getTarget().getClass().getName());
	}

}