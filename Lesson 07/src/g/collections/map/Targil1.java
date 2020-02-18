package g.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Targil1 {

	public static void main(String[] args) {
		// create a dictionary
		// get a word from user
		// display the definition

		Map<String, String> dictionary = new HashMap<>();

		dictionary.put("java", "a programming language");
		dictionary.put("table", "a furniture");
		dictionary.put("cow", "a nice a nimal that says moo");
		dictionary.put("school", "a place where students can learn new stuff");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a word");
		String key = sc.nextLine().toLowerCase();
		String value = dictionary.get(key);
		sc.close();

		if (value != null) {
			System.out.println(key + ": " + value);
		} else {
			System.out.println("the word " + key + " was not found in the dictionary");
		}

	}

}
