package a.finalDemo;

public class Person {

	// fields must be initialized (here or in CTOR)
	private final int id; // instance variable
	private String name;
	private static int counter; // class variable

	{ // increment counter in initializer is safer since it is common to all CTORs
		counter++;
	}

	public Person() {
		super();
		this.id = counter;
	}

	public Person(String name) {
		super();
		this.name = name;
		this.id = counter;
	}

	// class method
	public static int getCounter() {
		return counter;
	}

	// instance method. final method cannot be overriden
	public final int getId() {
		return this.id;
	}

	// instance methods - not final (can be overriden)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "person[id=" + this.id + ", name=" + this.name + "]";
	}

}
