package application.menu;

import application.exception.InvalidChoiceException;
import application.menu.common.Menu;
import application.menu.common.MenuType;
import application.menu.firstmenu.CountryMenu;
import application.menu.firstmenu.ParkZoneMenu;
import application.menu.firstmenu.SchoolMenu;
import application.menu.firstmenu.TravelMenu;
import application.menu.firstmenu.secondmenu.JapanMenu;
import application.menu.firstmenu.secondmenu.KoreaMenu;
import application.menu.firstmenu.secondmenu.UsaMenu;
import application.menu.firstmenu.secondmenu.thirdmenu.JSpotMenu;
import application.menu.firstmenu.secondmenu.thirdmenu.KSpotMenu;
import application.menu.firstmenu.secondmenu.thirdmenu.USpotMenu;

import java.io.IOException;
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
    public static Menu createMenu(MenuType menuType, Scanner scanner) throws InvalidChoiceException, IOException {
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
            case PARKINGZONE:
                return new ParkZoneMenu(scanner);
            case JAPAN:
                return new JapanMenu(scanner);
            case KOREA:
                return new KoreaMenu(scanner);
            case USA:
                return new UsaMenu(scanner);
            case COUNTRY:
                return new CountryMenu(scanner);
            case JSPOT:
                return new JSpotMenu(scanner);
            case KSPOT:
                return new KSpotMenu(scanner);
            case USPOT:
                return new USpotMenu(scanner);
            default:
                throw new InvalidChoiceException("알수 없는 메뉴"+menuType);
        }
        
    }


}
