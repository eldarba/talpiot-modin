package b.abstraction;

public class ShapeTest1 {

	public static void main(String[] args) {

		Shape s1 = new Rectangle("red", 2, 6);
		System.out.println(s1.getColor()); // implementation in Shape class
		System.out.println(s1.getArea()); // implementation in Rectangle class
	}

}
