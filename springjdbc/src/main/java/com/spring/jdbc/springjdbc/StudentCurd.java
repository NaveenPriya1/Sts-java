package com.spring.jdbc.springjdbc;

import java.util.List;

public interface StudentCurd {
	int addStudent(StudentBean s);
	List<StudentBean> getAllStudents();

}


