package d.objects;

public class Car {

	// define fields
	int number;
	int speed;
	String color;

	// METHOD DEFINITION = method signature + {method body}
	// method signature:
	// 1. return type
	// 2. Identifier
	// 3. parameters

	void drive(int newSpeed) {
		if (newSpeed >= 0 && newSpeed < 180) {
			speed = newSpeed;
		}
	}

	void stop() {
		speed = 0;
	}

}
