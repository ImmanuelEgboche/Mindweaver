public class Main {
    public static void main(String[] args) {
        System.out.println("Test");
    }
}

public class ConsturctorOverLoad {
	String s_name;
	int estYear;
	//overloading begin from here
	public ConsturctorOverLoad() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public ConsturctorOverLoad(String s_name) {
		super();
		this.s_name = s_name;
	}
void display() {
	System.out.println("School_Name -> "+s_name+" Establish Year -> "+estYear);
	
}
	public ConsturctorOverLoad(String s_name, int estYear) {
		super();
		this.s_name = s_name;
		this.estYear = estYear;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ConsturctorOverLoad c1 = new ConsturctorOverLoad();
  c1.display();
  ConsturctorOverLoad c2 = new ConsturctorOverLoad("DPS");
  c2.display();
  ConsturctorOverLoad c3 = new ConsturctorOverLoad("St Mira's", 1923);
  c3.display();
	}
	
}