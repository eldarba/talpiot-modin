package f.collections.set;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		set.add(5);
		set.add(7);
		set.add(3);
		set.add(1);
		set.add(9);

		System.out.println(set);

		int sum = 0;

		// to get access to elements in any collection we can use an iterator
		Iterator<Integer> it = set.iterator();
		System.out.println(it.getClass());
		LinkedHashMap x;

		while (it.hasNext()) {
			Integer curr = it.next();
			sum += curr;
			System.out.println(curr);
		}

		System.out.println("sum = " + sum);

	}

}
