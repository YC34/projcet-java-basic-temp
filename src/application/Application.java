package application;


import application.exception.InvalidChoiceException;
import application.menu.Menu;
import application.menu.MenuFactory;
import application.menu.MenuType;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws InvalidChoiceException {

        Scanner scanner = new Scanner(System.in);
        Menu currentMenu = MenuFactory.createMenu(MenuType.MAIN, scanner);

        while (true) {
            currentMenu.display();
            String choice = scanner.nextLine();

            try {
                currentMenu = (Menu) currentMenu.execute(choice);
            } catch (InvalidChoiceException e) {
                System.err.println(e.getMessage());
            }
        }

    }
}
