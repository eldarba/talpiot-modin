package b.inheritance.shapes;

public class Circle extends Shape {
	
	private double radius;
	
	
	public double getArea() {
		// PI * r ^ 2
		return Math.PI * Math.pow(radius, 2);
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		if(radius >= 0) {
			this.radius = radius;
		}
	}
	
	
}
