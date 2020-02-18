package a.claculators.implB;

import a.claculators.FullCalculator;

public class MyFullCalculator implements FullCalculator {

	private double res;

	@Override
	public double getResult() {
		return res;
	}

	@Override
	public void clear() {
		res = 0;

	}

	@Override
	public void add(double val) {
		res += val;
	}

	@Override
	public void sub(double val) {
		res -= val;
	}

	@Override
	public void mul(double val) {
		res *= val;

	}

	@Override
	public void div(double val) {
		res /= val;
	}

}
