package b.abstraction.speakers;

public class HebrewSpeaker extends Speaker {

	public HebrewSpeaker() {
		super("Hebrew");
	}

	@Override
	public void speak() {
		System.out.println("Shalom");

	}

}
