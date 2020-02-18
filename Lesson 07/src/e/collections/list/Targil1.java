package e.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Targil1 {

	// create a list of 10 random numbers in the range 0 - 10
	// use a loop to add the numbers
	// print the list
	public static void main(String[] args) {

		// create list
		List<Integer> list = new ArrayList<>();

		// define a loop of 10 iterations
		for (int i = 0; i <= 10; i++) {
			// create a random number and add to the list
			int r = (int) (Math.random() * 11);
			list.add(r);
		}

		// print
		System.out.println(list);

	}

}
