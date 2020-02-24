package d.points;

public class PointTest {
	
	public static void main(String[] args) {
		
		Point p = null;
		
		try {
			p = new Point(30, 5);
			System.out.println(p);
			p.setX(50);
			System.out.println(p);
			p.setY(22);
			System.out.println(p);
		} catch (IllegalXYException e) {
			// e is a reference to the IllegalXYException object created and thrown by the setter method.
			e.printStackTrace(System.out);
		}
		
		System.out.println("===========");
		System.out.println(p);
	}

}
