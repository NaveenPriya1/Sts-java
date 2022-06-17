package com.list;

public class MyClass{
	public void divide(int a, int b){
		try{
		int c= a/b;
		}catch(Exception e){
		System.out.print("Exception");
		}finally{
		System.out.println("Finally");
}
}
	public static void main(String[] args) {
		MyClass m = new MyClass();
		m.divide(1, 0);
	}}