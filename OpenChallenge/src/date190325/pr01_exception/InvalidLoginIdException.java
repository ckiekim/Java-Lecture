package date190325.pr01_exception;

public class InvalidLoginIdException extends Exception {
	public InvalidLoginIdException() {}
	public InvalidLoginIdException(String message) {
		super(message);
	}
}
