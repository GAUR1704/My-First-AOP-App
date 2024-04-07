package com.prowings.beans;

import org.springframework.stereotype.Component;

@Component
public class MyLogger {
	
	public void log(String msg) {
		
		System.out.println("LOG " + msg);
	}

}
