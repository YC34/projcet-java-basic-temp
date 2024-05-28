package application.menu;

import application.exception.InvalidChoiceException;
import application.menu.common.Menu;
import application.menu.common.MenuType;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainMenu implements Menu {
    private Scanner scanner;
    private List<String> options ;

    public MainMenu(Scanner scanner) {
        this.scanner = scanner;
        this.options= Arrays.asList("(S)chool","(T)ravel","(P)arkZone","(E)Exit");

    }

    @Override
    public void display() {
        System.out.println("메뉴를 입력 하세요.");
        for(String option : options){
            System.out.println(option);

        }
    }

    /**
     *
     * @param choice 메뉴명을 선택해야한다.
     * @return Menu인터페이스를 구현한 인스턴스를 반환한다.
     * @throws InvalidChoiceException
     *
     * description : toUpperCase()는 소문자로 입력되면 대문자로 변환해주는 메소드. String 클래스의 메소드
     */

    @Override
    public Menu execute(String choice) throws InvalidChoiceException, IOException {
        switch (choice.toUpperCase()) {
            case "S":
                return MenuFactory.createMenu(MenuType.SCHOOL, scanner);
            case "T":
                return MenuFactory.createMenu(MenuType.TRAVEL, scanner);
            case "P" :
                return MenuFactory.createMenu(MenuType.PARKINGZONE, scanner);
            case "E":
                System.out.println("종료합니다~!");
                System.exit(0);
            default:
                throw new InvalidChoiceException("없는 메뉴 입니다 ." + choice);
        }

    }
}
