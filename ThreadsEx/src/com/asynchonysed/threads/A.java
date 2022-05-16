package com.asynchonysed.threads;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Age");
		int age = sc.nextInt();
		
       try {
       
		assert age > 18;
		System.out.println("welcome to marriage portal");
       }catch(AssertionError e) {
    	   System.out.println(e);
    	   System.out.println("You age is not valid for marriage");
       }
	}

}
