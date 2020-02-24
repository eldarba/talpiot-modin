package b.exceptions.runtime;

public class Demo1 {

	// some RuntimeException examples

	public static void main(String[] args) {

		try {
			// when trying access index that does't exist
			int[] arr = { 2, 4, 6 };
			System.out.println(arr[1]);

			// when dividing by 0
			System.out.println(8 / 0);

			// when using a null reference to invoke methods
			String str = null;
			System.out.println(str.length());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index out of bounds");
		} catch (ArithmeticException e) {
			System.out.println("you cannot divide by 0");
		} catch (NullPointerException e) {
			System.out.println("you are using a null reference");
		}
	}

}
