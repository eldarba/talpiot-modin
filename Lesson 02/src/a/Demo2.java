package a;

public class Demo2 {
	static int x = 10; // global variables - in objects
	static int y; // initialized automatically (to 0, false)

	public static void main(String[] args) {
		int x = 5; // local variable to a method
		System.out.println(x);
		System.out.println(Demo2.x); 
		
		int y = 5; // not initialized automatically
		System.out.println("global y: " + Demo2.y);
		System.out.println("local y: " + y);
	}

}
