package z.exercise.part5;

/*
 * Create a class that defines 3 random numbers
 * in the range 0 to 100 inclusive
 * and prints the bigger value.
 *  */
public class Tar5 {

	public static void main(String[] args) {
		// create 3 random numbers (0 to 100)
		int a = (int) (Math.random() * 101);
		int b = (int) (Math.random() * 101);
		int c = (int) (Math.random() * 101);
		// print the numbers
		System.out.println(a + ", " + b + ", " + c);
		int max;

		if (a > b) {
			// if we are here b is not the max
			if (a > c) {
				max = a;
			} else {
				max = c;
			}
		} else {
			// if we are here a is not max
			if (b > c) {
				max = b;
			} else {
				max = c;
			}
		}
		System.out.println("max is: " + max);

	}

}
