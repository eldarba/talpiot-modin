package b.inheritance.shapes;

public class Circle extends Shape {
	
	double radius;
	
	double getArea() {
		// PI * r ^ 2
		return Math.PI * Math.pow(radius, 2);
	}
}
