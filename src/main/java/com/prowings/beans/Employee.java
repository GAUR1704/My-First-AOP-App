package com.prowings.beans;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	MyLogger logger = new MyLogger();
	
	
	public void work() {
		
		logger.log("Before logging something");
		
		System.out.println("Inside Employee work() method");
		
		logger.log("After logging something");
	}
	
	public void getStudentByName(String name) {
		
		System.out.println("Inside Employee getStudentByName() method ");
	}

}
