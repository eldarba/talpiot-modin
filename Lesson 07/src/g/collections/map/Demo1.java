package g.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {

	public static void main(String[] args) {

		// create a map
		Map<String, Integer> map = new HashMap<>();

		// add entries
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		Integer old = map.put("Shalosh", 3);
		System.out.println("old value of Shalosh: " + old);
		old = map.put("Shalosh", 333);
		System.out.println("old value of Shalosh: " + old);
		map.put("Four", 4);

		// get the values of keys
		System.out.println(map.get("One"));
		System.out.println(map.get("Three"));

		// print the entire map
		System.out.println(map);
	}

}
