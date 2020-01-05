package z.exercise.part5;

public class Tar4SalaryRaiser {
	/*
	 * Create a new class named “SalaryRaiser”
	 * 
	 * define a random number named ‘salary’ with a value between 5000-6000.
	 * 
	 * Now, raise the salary in 10% - only if the result is not greater than 6000
	 * (which is the maximum salary allowed)
	 * 
	 * print the current salary and the updated salary
	 */
	public static void main(String[] args) {

		double salary = (int) (Math.random() * 1001) + 5000;
		System.out.println("original salary: " + salary);

		if (salary * 1.1 <= 6000) {
			salary *= 1.1;
		}

		System.out.println("updated salary: " + salary);

	}
}
