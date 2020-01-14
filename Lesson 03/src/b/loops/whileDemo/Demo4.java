package b.loops.whileDemo;

public class Demo4 {
	
	public static void main(String[] args) {
		// print the numbers 0, 10, 20, ... 100
		int x = 0;
		while(x <= 100) {
			// print and then increment
			System.out.println(x);
//			x = x + 1; // increment
			x += 10; // increment
//			x++; // increment
		}
		
	}

}
