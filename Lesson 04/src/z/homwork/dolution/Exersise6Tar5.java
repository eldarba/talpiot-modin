package z.homwork.dolution;

public class Exersise6Tar5 {

	/*
	 * Create a class that defines a random number with value between 0-10000 and
	 * print the following details with clear messages:
	 * 
	 * number of digits [4867 - 4]
	 * 
	 * the first left digit [ 6843 - 6]
	 * 
	 * sum of the number’s digits [ 473 - 14]
	 * 
	 * opposite order of the number’s digits [5892 - 2985]
	 */
	public static void main(String[] args) {

		int r = (int) (Math.random() * 10001);
		System.out.println("the number is: " + r);
		int numOfDigits = 0;
		int leftDigit = 0;
		int sumOfDigits = 0;
		int opNumber = 0;

		while (r != 0) {
			numOfDigits++;

			if (r < 10) {
				leftDigit = r;
			}

			sumOfDigits += r % 10;

			// the opposite number calculation
			// 1. multiply by 10
			opNumber *= 10;
			// 2. get the right digit
			int rightDigit = r % 10;
			// 3. add the right digit
			opNumber += rightDigit;
			//

			r = r / 10; // get rid of right digit
		}

		// printouts
		System.out.println("number of digits: " + numOfDigits);
		System.out.println("left digit: " + leftDigit);
		System.out.println("sum of digits: " + sumOfDigits);
		System.out.println("oppsite number: " + opNumber);

	}
}
