package b.abstraction.speakers;

public class FrenchSpeaker extends Speaker {

	public FrenchSpeaker() {
		super("French");
	}

	@Override
	public void speak() {
		System.out.println("Bonjour");

	}

}
