package c.animals;

public class TestAnimals {

	public static void main(String[] args) {
		Animal[] animals = new Animal[10];
		animals[0] = new Ant();
		animals[1] = new Butterfly();
		animals[2] = new Cow();
		animals[3] = new Hawk();
		animals[4] = new Ostrich();
		animals[5] = new Cow();
		animals[6] = new Bat();
		animals[7] = new Ant();
		animals[8] = new Ostrich();
		animals[9] = new Cow();

		for (int i = 0; i < animals.length; i++) {
			animals[i].speak();
			// check if current animal is a Flyer
			if (animals[i] instanceof Flyer) {
				// if yes cast it to Flyer
				Flyer f = (Flyer) animals[i];
				// now we can invoke the fly method
				f.takeOff();
				f.fly();
			}
			System.out.println("============");
		}
	}

}
