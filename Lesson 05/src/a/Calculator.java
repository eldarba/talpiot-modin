package a;

/**
 * This class represents a calculator object with a current result. the
 * calculator has operations like add, subtract, multiply, divide etc.
 */
public class Calculator {

	/** the current result of this calculator */
	double result; // current result

	/**
	 * Adds the specified value to the current result
	 */
	void add(double val) {
		result = result + val;
	}

	/**
	 * Subtracts the specified value from the current result
	 */
	void sub(double val) {
		result = result - val;
	}

	/**
	 * Multiply the current result by the specified value
	 */
	void mul(double val) {
		result = result * val;
	}

	/**
	 * Divide the current result by the specified value
	 */
	void div(double val) {
		result = result / val;
	}

	/** return the current result */
	double getResult() {
		return result;
	}

	/** set the current result to 0 */
	void reset() {
		result = 0;
	}

}
