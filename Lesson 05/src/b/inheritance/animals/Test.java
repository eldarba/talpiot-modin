package b.inheritance.animals;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		Animal[] animals = new Animal[5];
		animals[0] = new Cat();
		animals[1] = new Cow();
//		animals[2] = new Cat();
		animals[3] = new Dog();
		animals[4] = new Cat();

		System.out.println(Arrays.toString(animals));
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] != null) {
				animals[i].speak();
			}
		}
	}
}
