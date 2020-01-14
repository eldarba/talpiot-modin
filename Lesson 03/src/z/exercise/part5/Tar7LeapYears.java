package z.exercise.part5;

public class Tar7LeapYears {

	public static void main(String[] args) {
		int year = (int) (Math.random() * 501) + 2000;
		System.out.println("the year " + year);

		// a leap year divides by 4 AND NOT by 100 OR divides by 400
		// == EQUALS
		// != NOT EQUALS
		// ! NOT
		// && AND
		// || OR

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("Leap year");
		} else {
			System.out.println("Not a leap year");
		}

	}

}








