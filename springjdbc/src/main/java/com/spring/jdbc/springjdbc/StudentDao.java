package com.spring.jdbc.springjdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao implements StudentCurd{
	
	JdbcTemplate temp;

	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}

	public int addStudent(StudentBean s) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<StudentBean> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}
