/*Synchronized method is used to lock an object for any shared resource.
When a thread invokes a synchronized method, it automatically acquires the lock for that object and releases it 
when the thread completes its task.*/
class Table{
	synchronized void printTable(int n) {
		for(int i =1;i<=5;i++) {
			System.out.println(n*i);
		}try {
			Thread.sleep(1000);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
class Thread1 extends Thread{
Table t ;	
	public Thread1(Table t) {
	super();
	this.t = t;
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.printTable(5);
	}
	
}
class Thread2 extends Thread{
	Table t ;
	Thread2(Table t) {
		
		this.t = t;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.printTable(3);
	}
	
}
public class TestSychronization extends Thread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Table obj = new Table();
Thread1 t1 = new Thread1(obj);
Thread2 t2 = new Thread2(obj);
t1.start();
t2.start();
	}
}
