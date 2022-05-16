package com.example.springJpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//select stuobj from Student studobj where stuobj.user='karthik';
public interface Studentrepo extends JpaRepository<Student, String> {
	@Query("select stuobj from Student stuobj where stuobj.suser=?1")
	public Student findByName(String name);
}

