package b.inheritance.shapes;

public class TestShapes {
	
	public static void main(String[] args) {
		System.out.println("==== rectangle ================");
		Rectangle r1 = new Rectangle();
//		r1.length = -5;
		r1.setLength(5);
//		r1.width = 3;
		r1.setWidth(3);
//		System.out.println("color: " + r1.color);
		System.out.println("color: " + r1.getColor());
		System.out.println("length: " + r1.getLength());
		System.out.println("width: " + r1.getWidth());
		System.out.println("area: " + r1.getArea());
		
		System.out.println("==== circle ===================");
		Circle c1 = new Circle();
		c1.setRadius(5);
		c1.setRadius(-2.3);
		c1.setColor("Green");
		System.out.println("color: " + c1.getColor());
		System.out.println("radius: " + c1.getRadius());
		System.out.println("area: " + c1.getArea());
		
	}

}
