package com.customer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.jpa.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
