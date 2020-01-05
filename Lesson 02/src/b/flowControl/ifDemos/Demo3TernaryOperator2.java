package b.flowControl.ifDemos;

public class Demo3TernaryOperator2 {

	public static void main(String[] args) {

		int x = (int) (Math.random() * 11);
		int y = (int) (Math.random() * 11);

		System.out.println("x = " + x);
		System.out.println("y = " + y);

		// assign the maximum value to the variable "max"
		int max = x > y ? x : y;

		System.out.println("max = " + max);

	}

}
