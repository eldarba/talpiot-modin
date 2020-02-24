package b.exceptions;

public class IllegalAgeException extends Exception {

	// generate constructors from super class
	
	public IllegalAgeException() {
		super();
	}

	public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public IllegalAgeException(String message, Throwable cause) {
		super(message, cause);
	}

	public IllegalAgeException(String message) {
		super(message);
	}

	public IllegalAgeException(Throwable cause) {
		super(cause);
	}
	
	

}
