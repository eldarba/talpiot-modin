package z.homework;

public class Test {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5);
		Rectangle r2 = new Rectangle("Blue", 5, 10);
		System.out.println(r1.color + ", " + r1.getLength() + ", " + r1.getWidth() + ", area: " + r1.getArea());
		System.out.println(r2.color + ", " + r2.getLength() + ", " + r2.getWidth() + ", area: " + r2.getArea());
	}
}
