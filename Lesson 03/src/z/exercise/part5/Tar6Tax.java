package z.exercise.part5;

public class Tar6Tax {

	public static void main(String[] args) {

		double sal = (int) (Math.random() * 120_000);
		sal = 2601;
		System.out.println("sal: " + sal); // the salaray

		double tax = 0; // the tax

		if (sal <= 23_000) {
			// if we are here they earn less than 23,000
			tax = sal * 0.1; // we take 10% on the entire salary
		} else {
			// if we are here they earn more than 23,000
			tax = 23_000 * 0.1; // we take 10% on the entire first grade
			if (sal <= 50_000) {
				// if we are here they earn less than 50,000
				// we take 20% on every shekel above 23,000
				tax += (sal - 23_000) * 0.2; 
			} else {
				// if we are here they earn more than 50,000
				// we take 20% on the entire second grade
				tax += (50_000 - 23_000) * 0.2;
				if (sal <= 100_000) {
					// if we are here they earn less than 100,000
					// we take 30% on every shekel above 50,000
					tax += (sal - 50_000) * 0.3;
				} else {
					// if we are here they earn more than 100,000
					// we take 30% on the entire third grade
					tax += (100_000 - 50_000) * 0.3;
					// we take 40% on every shekel above 100,000
					tax += (sal - 100_000) * 0.4;
				}
			}
		}
		
		System.out.println("tax: " + tax);

	}

}
