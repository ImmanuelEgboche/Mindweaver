public class StudentNew implements Comparable<StudentNew>{
String name ; int rollno ; int marks;
private StudentNew(String name, int rollno, int marks) {
	super();
	this.name = name;
	this.rollno = rollno;
	this.marks = marks;
}
@Override
public int compareTo(StudentNew o) {
	// TODO Auto-generated method stub
	if(marks==o.marks)
	return 0;
	else if(marks>o.marks)
		return 1;
	else 
		return -1;
}
public static void main(String args[]) {
	StudentNew s1 = new StudentNew("Adam", 101, 89);
	StudentNew s2 = new StudentNew("Steve", 105, 76);
	StudentNew s3 = new StudentNew("Nova", 108, 90);
	
	ArrayList<StudentNew> a = new ArrayList<>();
	a.add(s1);
	a.add(s2);
	a.add(s3);
	System.out.println(" Display Student Info sorted by Marks");
	Collections.sort(a);
	for(StudentNew s :a) {
		System.out.println("Name :"+s.name+"  RollNo : "+s.rollno+"  Marks: "+s.marks);
	}
	
}
}

import java.util.ArrayList;
import java.util.Collections;
public class ComparatorDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentData s1 = new StudentData(1, "Amit", 22, 78000);
		StudentData s2 = new StudentData(2, "Bhvesh", 23, 56000);
		StudentData s3 = new StudentData(6, "Bobby", 21, 830000);
		StudentData s4 = new StudentData(10, "Naomi", 21, 640000);
		
ArrayList< StudentData> a = new ArrayList<>();
a.add(s1);a.add(s2);a.add(s3);a.add(s4);
System.out.println("Sort by name ...");
Collections.sort(a,new NameComparator());
for(StudentData s : a) {
	System.out.println(s.name+"   "+s.rollno+"   "+s.age+"   "+s.fee);
}
System.out.println("====================================");
System.out.println("Sort by age...");
Collections.sort(a,new AgeComparator());
for(StudentData s : a) {
	System.out.println(s.name+"   "+s.rollno+"   "+s.age+"   "+s.fee);
}
System.out.println("===================================================");
System.out.println("Sort by Fee");
Collections.sort(a,new MarksComparator());
for(StudentData s : a) {
	System.out.println(s.name+"  ||  "+s.rollno+" ||   "+s.age+"  ||  "+s.fee);
}
	}
}