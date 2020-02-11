package b.abstraction.speakers;

public class SpeakersTest {

	public static void main(String[] args) {

		// define a reference (like a remote control)
		Speaker x;

		// Hebrew speaker
		x = new HebrewSpeaker();
		System.out.println("language: " + x.getLanguage());
		x.speak();

		// French speaker
		x = new FrenchSpeaker();
		System.out.println("language: " + x.getLanguage());
		x.speak();

		// English speaker
		x = new EnglishSpeaker();
		System.out.println("language: " + x.getLanguage());
		x.speak();

	}

}
