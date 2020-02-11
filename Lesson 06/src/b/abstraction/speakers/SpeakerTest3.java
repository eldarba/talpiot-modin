package b.abstraction.speakers;

import java.util.Scanner;

public class SpeakerTest3 {

	// get the speaker type from the user
	public static void main(String[] args) {
		Speaker speaker = null;
		// prompt user for language (input using scanner - text dialog)
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Language: heb/eng/fre");
		String lang = sc.nextLine();
		sc.close();

		switch (lang) {
		case "heb":
			speaker = new HebrewSpeaker();
			break;
		case "eng":
			speaker = new EnglishSpeaker();
			break;
		case "fre":
			speaker = new FrenchSpeaker();
			break;
		default:
			System.out.println(lang + " is an illegale language");
			break;
		}

		if (speaker != null) {
			System.out.println("language is " + speaker.getLanguage());
			speaker.speak();
		}
	}

}
