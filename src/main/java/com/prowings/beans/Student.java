package com.prowings.beans;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	public void showStudent() {
		
		System.out.println("inside showStudent() started!!!");
		
//		Some Business logic 
		
		if(10%2 != 1)
			
			throw new ArithmeticException();
			
			System.out.println("inside showStudent() ended!!!");
		
	}
	
	public String hello() {
		
		System.out.println("Inside Students hello() method!!!");
		
		return "abcd";
	}

}
