package a.claculators.implA;

import a.claculators.BasicCalculator;

public class BaseCalcImpl2 implements BasicCalculator {

	private double result; // the calculator result

	@Override
	public double getResult() {
		return this.result;
	}

	@Override
	public void clear() {
		this.result = 0;

	}

	@Override
	public void add(double val) {
		this.result += val;

	}

	@Override
	public void sub(double val) {
		this.result -= val;
	}

	public int sum(int a, int b) {
		return a + b;
	}

}
