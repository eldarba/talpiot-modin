package c.animals;

public class Hawk extends Bird implements Flyer {
	@Override
	public void speak() {
		System.out.println("speak like a hawk");
	}

	@Override
	public void fly() {
		System.out.println("fly like a hawk");
	}

	@Override
	public void takeOff() {
		System.out.println("takeoff like a hawk");

	}

}
