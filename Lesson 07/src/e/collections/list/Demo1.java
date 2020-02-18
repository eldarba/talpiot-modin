package e.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {

		// create a list of names
		List<String> names = new ArrayList<>();
		// add elements
		names.add("ddd");
		names.add("eee");
		names.add("aaa");
		names.add("ddd");
		// print the list
		System.out.println(names);

		names.add(3, "eee");
		System.out.println(names);

	}

}
