package com.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passport")
public class Passport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int passportId;
	@Column
	private String passportnum;
	
	public Passport(String passportnum) {
		super();
		this.passportnum = passportnum;
	}
	
	

}
