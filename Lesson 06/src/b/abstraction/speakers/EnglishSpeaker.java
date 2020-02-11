package b.abstraction.speakers;

public class EnglishSpeaker extends Speaker {

	// each class initialize the right language using the CTOR
	public EnglishSpeaker() {
		super("English");
	}

	@Override
	public void speak() {
		System.out.println("Hello");

	}

}
