package c.objects;

public class Person {

	// attributes are private
	private int id;
	private String name;
	private int age;
	
	// methods are public
	
	// set method for the age
	public void setAge(int theNewAge) {
		if(theNewAge >= 0 && theNewAge <= 120) {
			age = theNewAge;
		}
	}
	
	// get method for the age
	public int getAge() {
		return age;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// methods
	public void speak() {
		System.out.println(name + " is speaking");
	}

	public void eat() {
		System.out.println(name + " is eating");
	}

}
