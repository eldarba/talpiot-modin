package g.methodOverride;

import f.constructors.Car;
import f.constructors.RaceCar;

public class Test {

	public static void main(String[] args) {

		A a = new A();
		B b = new B();

		a.sayHello();
		b.sayHello();
		
		
		Car car1 = new Car(101);
		Car car2 = new RaceCar();

	}

}
