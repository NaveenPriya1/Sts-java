package com.customer.repo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.jpa.entity.Customer;
@Configuration
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
