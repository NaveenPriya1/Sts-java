package com.spring.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {

 @SuppressWarnings("resource")
ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");

   Employee emp = context.getBean(Employee.class);
   
   emp.showDetails();
	}

}
