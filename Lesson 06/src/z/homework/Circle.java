package z.homework;

public class Circle extends Shape {

	// field
	private double radius;

	// CTOR
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	// methods
	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
