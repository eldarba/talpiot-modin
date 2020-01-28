package d.keywordsThisAndSuper;

public class B extends A {
	
	int x = 2;
	
	void printX() {
		int x = 100;
		System.out.println(x); // 100 - local variable
		System.out.println(this.x); // 2 - x of this object
		System.out.println(super.x); // 1 - x of super class
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.printX();
	}
}

