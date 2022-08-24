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