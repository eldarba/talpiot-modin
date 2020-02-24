package b.exceptions;

public class Calculator {

	public int divide(int x, int y) {
		if (y != 0) {
			return x / y;
		} else {
			RuntimeException e = new RuntimeException("something went wrong - divide by 0");
			throw e;
		}
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		int val = c.divide(10, 0);

		System.out.println("- END -");
	}

}
