package com.asynchonysed.threads;

public class GenricsEx <x> {

	x i ;
	x j ;
	x k ;
	x l ;
	x m ;
	public static void main(String[] args) {
		GenricsEx ge = new GenricsEx();
		ge.i = 10;
		ge.j = 10.5f;
	    ge.k = 10.5555;
	    ge.l = "Naveen";
	    ge.m = 'n';
	    
		System.out.println(ge.i);
		System.out.println(ge.j);
		System.out.println(ge.k);
		System.out.println(ge.l);
		System.out.println(ge.m);
	}
}
