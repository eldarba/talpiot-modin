package z.exercise.part4;

public class Tar1 {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 101);
		int b = (int) (Math.random() * 101);

		System.out.println("a: " + a + ", b: " + b);

		int sum = a + b;
		System.out.println("sum: " + sum);

		double avg = sum / 2d;
		System.out.println("average: " + avg);

		System.out.println("remainder of " + a + " divided by 10: " + (a % 10));
		System.out.println("remainder of " + b + " divided by 10: " + (b % 10));

		int area = a * b;
		System.out.println("area of " + a + " x " + b + " rectangle: " + area);
	}

}
