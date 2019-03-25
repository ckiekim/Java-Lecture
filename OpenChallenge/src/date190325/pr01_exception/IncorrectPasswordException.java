package date190325.pr01_exception;

public class IncorrectPasswordException extends Exception {
	public IncorrectPasswordException() {}
	public IncorrectPasswordException(String message) {
		super(message);
	}
}
