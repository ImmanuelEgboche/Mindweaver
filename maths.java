package com.org.threadD;
public class ThreadOp implements Runnable {
int a=20,b=10;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		addition();
		subtraction();
		multiplication();
	}
	void addition() {
		int sum = a+b;
		System.out.println("addition = "+sum);
	}
	void subtraction() {
		int sub = a-b;
		System.out.println("subtraction = "+sub);
	}
	void multiplication() {
		int multi = a*b;
		System.out.println("Multiplication = "+multi);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ThreadOp t = new ThreadOp();
      Thread tt = new Thread(t);
      tt.start();
	}
}
