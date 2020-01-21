package d.objects;

public class TestCar {
	
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.number = 101;
		car1.speed = 0;
		car1.color = "Red";
		
		Car car2 = new Car();
		car2.number = 102;
		car2.speed = 30;
		car2.color = "Yellow";
		
		System.out.println("car 1: number=" + car1.number + ", color=" + car1.color + ", speed=" + car1.speed);
		System.out.println("car 2: number=" + car2.number + ", color=" + car2.color + ", speed=" + car2.speed);
		
		
		System.out.println("==================");
		car1.stop();
		System.out.println("car 1: number=" + car1.number + ", color=" + car1.color + ", speed=" + car1.speed);
		car1.drive(30);
		car1.drive(300);
		System.out.println("car 1: number=" + car1.number + ", color=" + car1.color + ", speed=" + car1.speed);
		car1.stop();
		System.out.println("car 1: number=" + car1.number + ", color=" + car1.color + ", speed=" + car1.speed);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
