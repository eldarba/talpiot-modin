package a.claculators.implA;

import a.claculators.BasicCalculator;
import a.claculators.Calculator;

public class Test {

	public static void main(String[] args) {

		// use the class as a reference. more strict
		BaseCalcImpl1 calc1 = new BaseCalcImpl1();

		// use the interface as a reference. more dynamic
		BasicCalculator calc2 = new BaseCalcImpl1();
		BasicCalculator calc3 = new BaseCalcImpl2();

	}

	// this method can get any type of calculator as a parameter and use it
	public static void useWhateverCalculator(Calculator calc) {
		calc.clear();
		double x = calc.getResult();
		System.out.println(x);
	}

	// this method can get only BaseCalcImpl1 calculator as a parameter and use it
	public static void useExactCalculator(BaseCalcImpl1 calc) {
		calc.clear();
		calc.add(5);
		double x = calc.getResult();
		System.out.println(x);
	}

}
