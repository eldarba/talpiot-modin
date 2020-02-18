package c.generics;

import b.enumTypes.Car;
import b.enumTypes.CarColor;

public class Test1 {

	public static void main(String[] args) {

		Box<Integer> myBoxOfNumbers = new Box<>(new Integer(5));
		System.out.println(myBoxOfNumbers);

		myBoxOfNumbers.setContent(10);
		System.out.println(myBoxOfNumbers);

		Box<String> boxOfString = new Box<>("AAA");

		Box<Car> boxOfCar = new Box<>(new Car(CarColor.RED));
	}

}
