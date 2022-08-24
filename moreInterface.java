ublic class MyClass implements InterfaceB {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyClass m = new MyClass();
m.m1();m.m2();m.m3();m.m4();
	}
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println(" M1 method of interface A");
	}
	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("M2 method of interface A");
	}
	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("M3 method of interface B");
	}
	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("m4 method of interface B");
	}
}