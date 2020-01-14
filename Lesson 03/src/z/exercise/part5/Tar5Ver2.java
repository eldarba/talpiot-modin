package z.exercise.part5;

/*
 * Create a class that defines 3 random numbers
 * in the range 0 to 100 inclusive
 * and prints the bigger value.
 *  */
public class Tar5Ver2 {

	public static void main(String[] args) {
		// create 3 random numbers (0 to 100)
		int a = (int) (Math.random() * 101);
		int b = (int) (Math.random() * 101);
		int c = (int) (Math.random() * 101);
		// print the numbers
		System.out.println(a + ", " + b + ", " + c);
		int max;
		
		// use the && (AND) operator for a complex boolean expression
		if(a > b && a > c) {
			max = a;
		}else {
			if(b > c) {
				max = b;
			}else {
				max = c;
			}
		}

		
		System.out.println("max is: " + max);

	}

}
