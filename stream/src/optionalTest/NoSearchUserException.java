package optionalTest;

// 커스텀 예외 생성
public class NoSearchUserException extends RuntimeException{
	public NoSearchUserException() {;}

	public NoSearchUserException(String message) {
		super(message);
	}
}
