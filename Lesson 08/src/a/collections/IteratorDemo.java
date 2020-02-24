package a.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorDemo {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		Iterator<String> it = set.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		
		
		
		
		
		
		
		
		
	}

}
