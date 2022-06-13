package com.spring.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.customer.repo.CustomerRepo;
import com.spring.jpa.entity.Customer;
import com.spring.jpa.entity.Item;

@SpringBootApplication
public class OneToOneUnidirectionalApplication implements CommandLineRunner{

	@Autowired
	CustomerRepo customerrepo;
	
	public static void main(String[] args) {
		SpringApplication.run(OneToOneUnidirectionalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Customer customer = new Customer("Naveen");
		Customer customer1 = new Customer("java");
		
		Item item = new Item("Oppo");
		Item item1 = new Item("realme");
		Item item2 = new Item("redme");
		Item item3 = new Item("xiomi");
		
		customer.getItems().add(item);
		customer.getItems().add(item1);
		customer1.getItems().add(item2);
		customer1.getItems().add(item3);
		
		customerrepo.save(customer);
		
	}

}
