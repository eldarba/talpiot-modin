package b.flowControl.ifDemos;

public class Demo2If {

	public static void main(String[] args) {

		int x = (int) (Math.random() * 11);
		System.out.println(x);

		// if the number x is greater than 5
		// print the word "BIG"
		// otherwise print "SMALL"

		if (x > 5) { // brackets required for more than 1 line
			System.out.println("BIG");
		} else {
			// false block
			System.out.println("SMALL");
		}

	}

}
