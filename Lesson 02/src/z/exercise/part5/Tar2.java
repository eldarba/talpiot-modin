package z.exercise.part5;

public class Tar2 {
	/*
	 * Create a new class that defines a random number with a value between 0-100.
	 * 
	 * if the number is greater than 50 – print “Big !”
	 * 
	 * if the number is less then 50 – print “Small !”
	 * 
	 * if the number equals to 50 – print “Bingo !”
	 */
	public static void main(String[] args) {
		int x = (int) (Math.random() * 101);
		System.out.println("x: " + x);
		if (x > 50) {
			System.out.println("Big");
		} else if (x < 50) {
			System.out.println("Small");
		} else {
			System.out.println("Bingo");
		}
	}

}
