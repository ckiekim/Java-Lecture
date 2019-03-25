package sec07_user_define_exception;

public class BalanceInsufficientException extends RuntimeException {
	public BalanceInsufficientException() { }
	public BalanceInsufficientException(String message) {
		super(message);
	}
}

