package com.prowings.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class StudentAspect {
	
	@Before("execution(* com.prowings.beans.Student.*(..))")
	public void logBefore()
	{
		System.out.println(">> before");
	}

//	@After("execution(* com.prowings.beans.Student.*(..))")
//	@AfterReturning("execution(* com.prowings.beans.Student.*(..))")
	@AfterThrowing("execution(* com.prowings.beans.Student.*(..))")
	public void logAfter()
	{
		System.out.println(">> after");
	}

	@Around("within(com.prowings.beans.Student)")
	public void logBeforeAfter(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

		System.out.println(">>>> BeforeAfter >>>>>>");

		Object returnedValue = proceedingJoinPoint.proceed();

		System.out.println(returnedValue);
		System.out.println(">> BeforeAfter <<");

	}

}
