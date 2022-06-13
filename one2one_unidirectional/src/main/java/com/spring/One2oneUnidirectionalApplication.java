package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.customerrepo.CustomerRepository;
import com.spring.entity.Customer;
import com.spring.entity.Passport;

@SpringBootApplication
public class One2oneUnidirectionalApplication implements CommandLineRunner{

	
	   @Autowired(required = true)
	   CustomerRepository crepo;
	   
	public static void main(String[] args) {
		SpringApplication.run(One2oneUnidirectionalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Customer customer = new Customer("Naveen");
		
		Passport passport = new Passport("V12345");
		
		customer.setPassport(passport);
		
		crepo.save(customer);
		
	}

}
