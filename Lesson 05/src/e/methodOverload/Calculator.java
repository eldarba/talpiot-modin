package e.methodOverload;

import java.util.Arrays;

public class Calculator {
	
	// sum of 2 numbers
	public int sum(int a, int b) {
		return a + b;
	}
	// sum of 3 numbers
	public int sum(int a, int b, int c) {
		return a + b + c;
	}
	// sum of 2 decimal numbers
	public double sum(double a, double b) {
		return a + b;
	}
	// sum of any number of decimal numbers (varargs)
	public double sum(double... args) {
		System.out.println(Arrays.toString(args));
		double sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += args[i];
		}
		return sum;
	}
	
	public static void main(String... args) {
		
		Calculator c = new Calculator();
		System.out.println(c.sum(2, 5));
		System.out.println(c.sum(2, 5, 9));
		System.out.println(c.sum(2.2, 5.3));
		System.out.println(c.sum(2.2, 5.3, 3, 6, 4.6, 2, 7));
		
		System.out.println("aaa");
		System.out.println(5);
		System.out.println(5.3);
		System.out.println(true);
	}

}
