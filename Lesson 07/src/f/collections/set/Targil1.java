package f.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Targil1 {

	// create a set of 10 random numbers in the range 0 - 10
	// use a loop to add the numbers
	// print the set
	public static void main(String[] args) {

		// create set
		Set<Integer> set = new LinkedHashSet<>();

		int iterations = 0;
		// define a loop of 10 iterations
		while (set.size() < 10) {
			// create a random number and add to the list
			int r = (int) (Math.random() * 11);
			set.add(r);
			iterations++;
		}

		// print
		System.out.println(set);
		System.out.println("number of iterations: " + iterations);

	}

}
