package com.synchonysed.threads;

public class ThreadEx {

	int balance;
	
	public static void main(String[] args) {
		ThreadEx te = new ThreadEx();
		te.amount();
		System.out.println(te.balance);
		
	}
	public void amount() {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				add();// this.add();
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				sub(); // this.sub
				
			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
	
	public synchronized void add() {
		for(int i=0;i<=10000;i++) {
			balance = balance+i;
		}
	}
	
	public synchronized void sub() {
		for(int i=0;i<=10000;i++) {
			balance = balance-i;
		}
	}
	
	
	

}
