package b.abstraction;

// an abstract class cannot be instantiated
// an abstract class can be used as reference
public abstract class Shape {

	// field
	private String color;

	// CTOR 1
	public Shape(String color) {
		super();
		this.color = color;
	}

	// CTOR 2
	public Shape() {
	}

	// concrete methods
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// abstract methods
	public abstract double getArea();

}
