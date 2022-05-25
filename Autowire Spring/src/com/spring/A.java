package com.spring;

public class A {
	
	B b;
	
	A(){
		System.out.println("From A Constructor");
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
	
	void print() {
		System.out.println("From A print()");
	}
	
	public void display() {
		print();
		b.print();
	}

}
