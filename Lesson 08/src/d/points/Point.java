package d.points;

public class Point {

	private int x;
	private int y;

	// CTOR
	public Point(int x, int y) throws IllegalXYException {
		super();
		setX(x);
		setY(y);
	}

	// setter
	public void setX(int x) throws IllegalXYException {
		if (x >= 0 && x <= 100) {
			this.x = x;
		} else {
			throw new IllegalXYException(x + " is out of range for x");
		}
	}

	public void setY(int y) throws IllegalXYException {
		if (y >= 0 && y <= 100) {
			this.y = y;
		} else {
			throw new IllegalXYException(y + " is out of range for y");
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
