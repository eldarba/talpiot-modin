package z.exercise.part5;

public class Tar3 {

	/*
	 * Create a new class that defines a random number with a value between 0-100.
	 * 
	 * if the value is between 0-50 – print “Small !”
	 * 
	 * else – print “Big !”
	 * 
	 * in addition :
	 * 
	 * if the value is even (can be divided by 2) – print “Even”
	 * 
	 * else – print “Odd”
	 */
	public static void main(String[] args) {
		int x = (int) (Math.random() * 101);
		System.out.println("x: " + x);

		if (x <= 50) {
			System.out.println("Small");
		}else {
			System.out.println("Big");
		}

		if (x % 2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}

	}

}
