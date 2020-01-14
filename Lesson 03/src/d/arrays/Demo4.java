package d.arrays;

import java.util.Arrays;

public class Demo4 {

	/*
	 * Create a class that creates an array[10] of numbers with 
	 * random values between 0- 100 and prints the total sum and 
	 * the average.
	 */
	public static void main(String[] args) {
		
		int[] numbers = new int[10];
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			// populate the current index with a number
			numbers[i] = (int) (Math.random()*101);
			sum += numbers[i];
		}
		
		// print array elements
		System.out.println(Arrays.toString(numbers));
		System.out.println("sum = " + sum);
		System.out.println("avg = " + sum/(double)numbers.length);

	}

}
