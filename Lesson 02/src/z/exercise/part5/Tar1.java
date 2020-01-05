package z.exercise.part5;

public class Tar1 {

	/*
	 * Create a class that defines 2 random numbers and prints the bigger value
	 */
	public static void main(String[] args) {

		int x = (int) (Math.random() * 101);
		int y = (int) (Math.random() * 101);
		System.out.println("(" + x + ", " + y + ")");

		if (x > y) {
			System.out.println(x);
		} else {
			System.out.println(y);
		}

	}

}
