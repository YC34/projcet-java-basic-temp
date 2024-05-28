package application.menu.common;


import application.exception.InvalidChoiceException;
import java.io.IOException;

/**
 * menu 인터페이스
 * 공통으로 사용될 메소드
 *
 */
public interface Menu {
    void display();
    Menu execute(String choice) throws InvalidChoiceException, IOException;


}
