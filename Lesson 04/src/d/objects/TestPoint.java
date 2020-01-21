package d.objects;

public class TestPoint {
	
	public static void main(String[] args) {
		// use the "new" keyword to create objects
		Point p1 = new Point();
		Point p2 = new Point();
		
		// print the Point object state (the values of its fields)
		System.out.println("(" + p1.x + ", " + p1.y + ")");
		System.out.println("(" + p2.x + ", " + p2.y + ")");
		
		p1.x = 3;
		p1.y = 5;
		p2.x = 300;
		p2.y = 500;

		System.out.println("(" + p1.x + ", " + p1.y + ")");
		System.out.println("(" + p2.x + ", " + p2.y + ")");
	}

}
