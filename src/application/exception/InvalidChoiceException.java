package application.exception;

/**
 * 잘못된 메뉴를 선택하였을시 오류 처리.
 */
public class InvalidChoiceException extends Exception{
    public InvalidChoiceException(String message) {
        super(message);
    }
}
