package com.example.springJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springJpa.repo.CustomerRepo;
import com.springJpa.Entity.Customer;
import com.springJpa.Entity.Item;

@SpringBootApplication
public class OneToOneUnidirectionalApplication1 implements CommandLineRunner{

	@Autowired
	CustomerRepo customerrepo;
	
	public static void main(String[] args) {
		SpringApplication.run(OneToOneUnidirectionalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Customer customer = new Customer("Naveen");
		
		Item item = new Item("Iphone");
		
		customer.setItem(item);
		
		customerrepo.save(customer);
		
	}

}
