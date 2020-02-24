package a.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {

		// LIST
		List<Integer> list = new ArrayList<>();

		System.out.println("size: " + list.size());
		System.out.println("isEmpty: " + list.isEmpty());
		System.out.println("contains 5: " + list.contains(5));
		System.out.println(list.toString());

		// add some elements
		list.add(10);
		list.add(10);
		list.add(5);
		list.add(3);
		list.add(5);
		
		

		System.out.println("============");
		System.out.println("size: " + list.size());
		System.out.println("isEmpty: " + list.isEmpty());
		System.out.println("contains 5: " + list.contains(5));
		System.out.println(list);
		System.out.println(list.get(0));

		// SET
		// use CTOR to create a collection from another collection
		Set<Integer> set = new LinkedHashSet<>(list);
		System.out.println("============");
		System.out.println("size: " + set.size());
		System.out.println("isEmpty: " + set.isEmpty());
		System.out.println("contains 5: " + set.contains(5));
		System.out.println(set);
		
		// an iterator is an object which let us get access to collection's elements
		Iterator<Integer> it1 = set.iterator();
		int x = it1.next(); // get the first element
		

		// MAP
		Map<String, Integer> map = new HashMap<>();
		map.put("key1", 111);
		map.put("key2", 222);
		map.put("key3", 333);
		map.put("key4", 444);

		System.out.println("============");
		System.out.println(map.get("key3"));
		System.out.println(map);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
