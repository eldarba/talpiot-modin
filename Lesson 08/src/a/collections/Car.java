package a.collections;

public class Car {
	
	// fields
	public final int number;
	private int speed;
	
	// CTOR
	public Car(int number, int speed) {
		super();
		this.number = number;
		this.speed = speed;
	}

	// methods
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car [number=" + number + ", speed=" + speed + "]";
	}
	
	
	
	

	
	
	
	
	

}
