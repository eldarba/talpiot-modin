package a;

public class AdvancedCalculator extends Calculator {

	/** increase the result by the power of the specified value */
	void power(double val) {
		result = Math.pow(result, val);
	}

}
