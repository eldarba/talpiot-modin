package b.inheritance.shapes;

public class TestShapes {
	
	public static void main(String[] args) {
		System.out.println("==== rectangle ================");
		Rectangle r1 = new Rectangle();
		r1.length = 5;
		r1.width = 3;
		System.out.println("color: " + r1.color);
		System.out.println("length: " + r1.length);
		System.out.println("width: " + r1.width);
		System.out.println("area: " + r1.getArea());
		
		System.out.println("==== circle ===================");
		Circle c1 = new Circle();
		c1.radius = 2.3;
		c1.color = "Green";
		System.out.println("color: " + c1.color);
		System.out.println("radius: " + c1.radius);
		System.out.println("area: " + c1.getArea());
		
	}

}
