package com.org.threadD;
public class NestedTryBlock {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "Simplilearn-Makes easy!!!!";
int x[] = {0,1,2,3,4};//index = 1,2,3,4,5
//outer try block
try {
  String str1 = "Exception handling";//exception occurred
	int length = str1.length();
	System.out.println("String length = "+length);
	//inner try block
	    try {
		 int y = 6;
		 System.out.println(x[y]);//x[6]
	     }catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
		 System.out.println("Inner block Exception Thrown");
		 System.out.println(e.toString());
	}
}catch (Exception e) {
	// TODO: handle exception
	System.out.println("Outer block exception "+e);
}
	}
}

package com.org.threadD;
public class Employee {
	//declaration of sate/properties
	String name;int id ; int sal ;//instance variable 
	public Employee(String name, int id, int sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
   //declaration of Actions 
	void display() {
		System.out.println("Name -> "+name+" Id-> "+id+" Salary -> "+sal);
	}
   void countSal() {
	   System.out.println("Total salary = "+ (5000+2000+sal));
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Employee Hr = new Employee("Jonas", 101, 30000);
      Hr.display(); Hr.countSal();
      
      Employee Dev = new Employee("Eva", 102, 340000);
      Dev.display();Dev.countSal();
      
      Employee Manager = new Employee("Meesha", 106, 50000);
      Manager.display();Manager.countSal();
      
      Employee DevEng = new Employee("Victor", 120, 40000);
      DevEng.display();DevEng.countSal();
      
	}
}