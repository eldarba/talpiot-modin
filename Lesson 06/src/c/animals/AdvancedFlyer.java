package c.animals;

// multiple inheritance is possible with interfaces
public interface AdvancedFlyer extends Flyer, Navigator {

	void land();

	void turn();

}
