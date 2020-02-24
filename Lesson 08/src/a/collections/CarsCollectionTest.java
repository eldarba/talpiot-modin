package a.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CarsCollectionTest {
	
	public static void main(String[] args) {
		// create a set of cars
		Set<Car> cars = new HashSet<Car>();
		
		// add cars to the set
		cars.add(new Car(101, 50));
		cars.add(new Car(102, 20));
		cars.add(new Car(103, 90));
		cars.add(new Car(105, 0));
		
		// find the fastest car
		// declare the needed variables
		int fastesCarNumber = -1;
		int maxSpeed = 0;
		
		Iterator<Car> it = cars.iterator();
		
		while(it.hasNext()) {
			Car car = it.next();
			if(car.getSpeed() > maxSpeed) {
				maxSpeed = car.getSpeed();
				fastesCarNumber = car.number;
			}
		}
		
		// print results
		System.out.println("fastest car: " + fastesCarNumber);
		System.out.println("speed: " + maxSpeed);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
