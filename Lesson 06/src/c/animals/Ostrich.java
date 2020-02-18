package c.animals;

public class Ostrich extends Bird implements Navigator {
	@Override
	public void speak() {
		System.out.println("speak like an ostrich");
	}

	@Override
	public void navigate() {
		System.out.println("navigate like an ostrich");
	}
}
