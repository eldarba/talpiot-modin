package b.abstraction.speakers;

import javax.swing.JOptionPane;

public class SpeakerTest2 {

	// get the speaker type from the user
	public static void main(String[] args) {
		Speaker speaker = null;
		// prompt user for language (input using JOptionPane - graphic dialog)
		String lang = JOptionPane.showInputDialog("Enter Language: heb/eng/fre");

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
