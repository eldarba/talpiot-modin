package b.enumTypes;

public class Car {

	private CarColor color = CarColor.BLACK;

	public Car(CarColor color) {
		setColor(color);
	}

	public CarColor getColor() {
		return color;
	}

	public void setColor(CarColor color) {
		if (color != null) {
			this.color = color;
		}
	}

	@Override
	public String toString() {
		return "Car [color=" + color + "]";
	}

}
