package a.finalDemo;

public class Point {

	// constants are a combination of static and final
	static final int MAX = 100;
	static final int MIN = 0;

	private int x;
	private int y;

	public Point(int x, int y) {
		setX(x);
		setY(y);
	}

	public void setX(int x) {
		if (x >= MIN && x <= MAX) {
			this.x = x;
		}
	}

	public void setY(int y) {
		if (y >= MIN && y <= MAX) {
			this.y = y;
		}
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
