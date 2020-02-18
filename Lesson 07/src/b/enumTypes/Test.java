package b.enumTypes;

public class Test {

	public static void main(String[] args) {

		Car car1 = new Car(null);
		System.out.println(car1);

		Car car2 = new Car(CarColor.RED);
//		car2.color = null;
		System.out.println(car2);

		Car car3 = new Car(CarColor.GREEN);
		System.out.println(car3);

	}

}
