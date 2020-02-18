package f.collections.set;

import java.util.HashSet;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {

		// create a set of names
		Set<String> names = new HashSet<>();
		// add elements
		names.add("David");
		names.add("Eliyahu");
		names.add("Avi");
		names.add("Dorit");
		// print the set
		System.out.println(names);

		names.add("eee");
		names.add("mmm");
		System.out.println(names);

	}

}
