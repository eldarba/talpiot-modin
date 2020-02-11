package a.finalDemo;

public class PointTest {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 2, 1, 5 };
		Point[] points = { new Point(2, 5), new Point(5, 5), new Point(12, 65) };

		for (int i = 0; i < points.length; i++) {
			System.out.println(points[i]);
		}
	}
}
