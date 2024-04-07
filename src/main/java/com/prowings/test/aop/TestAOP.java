package com.prowings.test.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.prowings.beans.Employee;
import com.prowings.beans.Student;
import com.prowings.config.AppConfig;

public class TestAOP {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//		Employee emp = context.getBean(Employee.class);
//
//		emp.work();
//
//		System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
//
//		emp.getStudentByName("Gaurav");

		Student student = context.getBean(Student.class);

		student.showStudent();
		
		student.hello();
	}

}
