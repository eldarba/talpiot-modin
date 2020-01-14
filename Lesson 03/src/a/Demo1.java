package a;

public class Demo1 {

	public static void main(String[] args) {

		int x; // declaration
		x = 5; // assignment

		int y = 10; // declaration + assignment

		// an if statement with 1 line
		if (x < y)
			System.out.println("x is smaller than y");

		// an if statement with many lines
		if (x < y) {
			System.out.println("x is smaller than y");
			System.out.println("x=" + x + ", y=" + y);
		} else {
			System.out.println("x is NOT smaller than y");
		}

	}

}
