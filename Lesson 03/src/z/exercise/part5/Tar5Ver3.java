package z.exercise.part5;

/*
 * Create a class that defines 3 random numbers
 * in the range 0 to 100 inclusive
 * and prints the bigger value.
 *  */
public class Tar5Ver3 {

	public static void main(String[] args) {
		// create 3 random numbers (0 to 100)
		int a = (int) (Math.random() * 101);
		int b = (int) (Math.random() * 101);
		int c = (int) (Math.random() * 101);
		int d = (int) (Math.random() * 101);
		int e = (int) (Math.random() * 101);
		// print the numbers
		System.out.println(a + ", " + b + ", " + c + ", " + d + ", " + e);
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (d > max) {
			max = d;
		}
		if (e > max) {
			max = e;
		}

		System.out.println("max = " + max);

	}

}
