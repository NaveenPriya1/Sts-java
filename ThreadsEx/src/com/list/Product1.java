package com.list;

import java.util.*;

public class Product1 {
	int price;
	double quantity;
	String type;
	
	

	public Product1(int price, double quantity, String type) {
		super();
		this.price = price;
		this.quantity = quantity;
		this.type = type;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Product1 p1 = new Product1(15000, 15, "Tv");
     Product1 p2 = new Product1(8245, 5, "Radio");
     
     List<Product> pl = new LinkedList<Product>();
    
     
	}

}
