package com.spring.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("pom.xml");
		
		Employee e = context.getBean(Employee.class);
		
		e.show();
		

	}

}
