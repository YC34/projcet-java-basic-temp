package application.exception;


/**
 * 체크하지 못함.
 */
public class UnExpectedException extends Exception{
    public UnExpectedException(String message) {
        super(message);
    }
}
