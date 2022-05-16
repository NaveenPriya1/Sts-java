package com.example.springJpa;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Student {
   @Id
	String suser;
	String spassword;
	String email;

}
