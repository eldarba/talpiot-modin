package c.objects;

public class App {
	
	public static void main(String[] args) {
		// create a Person object
		Person p1 = new Person();
		Person p2 = new Person();
		
		// assign names
		p1.setName("David");
		p2.setName("Sarrah");
		// invoke methods on the objects
		p1.speak();
		p2.speak();
//		p1.age = -25;
		p1.setAge(25);
		
		System.out.println(p1.getName() +  "'s age: " + p1.getAge());
		
		
		
	}

}
