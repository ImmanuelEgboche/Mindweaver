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

package com.org.threadD;
public class NewThread extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println("New thread starts running ");
		System.out.println("I am in run() method");
	}
	public static void main(String args[]) {
		System.out.println("main Thread starts running");
		Thread t1 =  Thread.currentThread();
		System.out.println(t1);
		int ac1 = Thread.activeCount();
		System.out.println(" Active count -> "+ac1);
		
		//create an object of NewThread class 
		NewThread nt = new NewThread();
		int ac2 = Thread.activeCount();
		System.out.println(ac2);
		
		//create an object of Thread class and pass the object ref variable nt
		Thread t = new Thread(nt);
		int ac3 = Thread.activeCount();
		System.out.println(ac3);
		
		t.start();
		int ac4 = Thread.activeCount();
		System.out.println(ac4);
		t.setName("NewThread");
	}
}

package com.org.threadD;
public class ThreadDemo implements Runnable {
	public static void main(String args[]) {
		System.out.println("Main Thread running ");
	ThreadDemo t = new ThreadDemo();
	Thread t1 = new Thread(t);
	t1.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" Hello ...new thread is running  ");	
	}
}