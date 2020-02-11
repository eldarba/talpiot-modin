package b.abstraction.speakers;

// define an abstract class
public abstract class Speaker {

	private String language;

	public Speaker(String language) {
		super();
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}

	// define an abstract method
	public abstract void speak();

}
