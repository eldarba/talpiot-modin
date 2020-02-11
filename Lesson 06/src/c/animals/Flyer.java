package c.animals;

public interface Flyer {

	void fly();

	// interface method can have default behavior
	default void takeOff() {
		System.out.println("Taking off");
	}

}
