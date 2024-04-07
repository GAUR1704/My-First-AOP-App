package com.prowings.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.prowings.beans.MyLogger;

@Component
@Aspect
public class EmployeeAspect {
	
	@Autowired
	MyLogger logger;
	
	long start;
	long end;
	
	@Before("execution(* com.prowings.beans.Employee.*(..))")
	public void logBefore(JoinPoint joinpoint) {
		
		start = System.currentTimeMillis();
		
		System.out.println("Inside Before");
		
		logger.log("before advice executed!! started at : "+ start);
		
		System.out.println(">>> target method signature is : "+joinpoint.getSignature());
	}
	
	@After("execution(* com.prowings.beans.Employee.*(..))")
	public void logAfter(JoinPoint joinpoint) {
		
		end = System.currentTimeMillis();
		
		System.out.println("Inside After");
		
		logger.log("after advice executed!! finised in : "+ (end - start) + "ms");
	}

}
