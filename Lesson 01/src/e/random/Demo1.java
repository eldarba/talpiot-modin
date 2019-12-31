package e.random;

public class Demo1 {

	public static void main(String[] args) {

		// Math.random() - random number 0 - 1
		double r = Math.random();
		System.out.println(r);
		System.out.println(r * 11);
		System.out.println((int) (r * 11));
		System.out.println("===========");
		
		int r2 = (int) (Math.random() * 11);
		System.out.println(r2);

	}

}
