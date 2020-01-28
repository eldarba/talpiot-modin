package f.constructors;

public class A {
	
	// initializer - a block of code that runs before ctor
	{
		System.out.println(">>> A initializer");
	}

	// constructor - runs on object creation
	public A() {
		System.out.println(">>> A ctor 1");
	}
	public A(int x) {
		System.out.println(">>> A ctor 2");
	}
	
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A(4);
	}

}
