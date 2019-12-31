package c.primitives;

public class Demo2 {
	
	// suffix on literals
	// F for float
	// L for long
	// D for double
	
	public static void main(String[] args) {
		float f1 = 5; // literal 5 is of type int
		float f2 = 5.3F; // 5.3 is double but 5.3F is float
		long x = 9999999999L; // 9999999999 is int but 9999999999L is long 
		
		// notice that double is more precise than float
		System.out.println(3.333333333333333333333333333333); 
		System.out.println(3.333333333333333333333333333333F);
		
		System.out.println(5); // 5 is int
		System.out.println(5D); // 5D is double
		System.out.println(9999999999L); // 9999999999L is long
	}

}
