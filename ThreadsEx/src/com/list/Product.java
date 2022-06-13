package com.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al  = new ArrayList<String>();
		al.add("Babu");
		al.add("Suresh");
		al.add("kiran");
		al.add("Zain");
		
		System.out.println(al);
		ListIterator<String> itr = al.listIterator(al.size());
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
