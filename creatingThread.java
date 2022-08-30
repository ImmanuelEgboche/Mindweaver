package com.org.threadD;
public class MyThread extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println(" New Thread running ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //create the object of my thread class 
		MyThread th = new MyThread();
		
		//create an object of thread class and pass the object ref  variable th 
		Thread t = new Thread(th);
		//now run thread on the object for this call start() method using ref variable t 
		t.start();//this thread will execute statements inside run() method of MyThread object 
	}
}