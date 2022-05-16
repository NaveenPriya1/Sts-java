package com.spring.ex;

import lombok.Data;

@Data
public class Employee {

       int empId;
       String empName;
     
	public void showDetails() {
		System.out.println(empId+" "+empName);
		
	}
	 
	
	
	
}
