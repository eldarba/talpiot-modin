package f.constructors;

public class Car {

	// fields
	private int number;
	private String color;
	private int currentSpeed;
	

	// CTOR 1
	public Car(int number, String color, int currentSpeed) {
		super(); // the default call - we can delete this if we want
		System.out.println("ctor 1");
		this.number = number;
		this.color = color;
		this.currentSpeed = currentSpeed;
	}

	// CTOR 2
	public Car(int number) {
		this(number, "White", 0);
		System.out.println("ctor 2");
	}

	// CTOR 3
	public Car(String color) {
		System.out.println("ctor 3");
		this.color = color;
	}

	/////////////////////////////////
	public static void main(String[] args) {
		Car c1 = new Car(102, "Red", 30);
		Car c2 = new Car(101);
		Car c3 = new Car("Brown");
		System.out.println("car[number: " + c1.number + ", color: " + c1.color + ", speed: " + c1.currentSpeed + "]");
		System.out.println("car[number: " + c2.number + ", color: " + c2.color + ", speed: " + c2.currentSpeed + "]");
	}

}
