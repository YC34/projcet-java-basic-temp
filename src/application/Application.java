package application;


import application.exception.InvalidChoiceException;
import application.menu.common.Menu;
import application.menu.MenuFactory;
import application.menu.common.MenuType;

import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws InvalidChoiceException, IOException {

        Scanner scanner = new Scanner(System.in);
        Menu currentMenu = MenuFactory.createMenu(MenuType.MAIN, scanner);

        while (true) {
            currentMenu.display();
            String choice = scanner.nextLine();
            try {
                currentMenu = currentMenu.execute(choice);
            } catch (InvalidChoiceException e) {
                System.err.println(e.getMessage());
            }

        }


    }
}
