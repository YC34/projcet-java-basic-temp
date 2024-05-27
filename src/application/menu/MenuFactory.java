package application.menu;

import application.exception.InvalidChoiceException;
import application.menu.common.Menu;
import application.menu.common.MenuType;

import java.util.Scanner;

public class MenuFactory {
    public static MenuFactory menuFactory;

    public MenuFactory() {
    }

    public static MenuFactory getInstance() {
        if (menuFactory == null) {
            menuFactory = new MenuFactory();
        }
        return menuFactory;
    }


    /**
     *
     * @param menuType
     * @param scanner
     * @return 각 메뉴 객체 -> 각 메뉴 클래스에서는 Menu 인터페이스를 구현해야한다.
     * @throws InvalidChoiceException
     */
    public static Menu createMenu(MenuType menuType, Scanner scanner) throws InvalidChoiceException {
        switch (menuType){
            case EXIT:
                System.out.println("종료합니다");
                System.exit(0);
            case MAIN:
                return new MainMenu(scanner);
            case SCHOOL:
                return new SchoolMenu(scanner);
            case TRAVEL:
                return new TravelMenu(scanner);
            default:
                throw new InvalidChoiceException("알수 없는 메뉴"+menuType);
        }
        
    }


}
