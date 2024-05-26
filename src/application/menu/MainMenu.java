package application.menu;

import application.exception.InvalidChoiceException;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainMenu implements Menu{
    private Scanner scanner;
    private List<String> options ;

    public MainMenu(Scanner scanner) {
        this.scanner = scanner;
        this.options= Arrays.asList("(S)School","(E)Exit");
    }

    @Override
    public void display() {
        System.out.println("메뉴를 입력 하세요.");
        for(String option : options){
            System.out.println(option);

        }
    }

    @Override
    public Menu execute(String choice) throws InvalidChoiceException {
        switch (choice.toUpperCase()) {
            case "S":
                return MenuFactory.createMenu(MenuType.SCHOOL, scanner);
            case "E":
                System.out.println("종료합니다~!");
                System.exit(0);
            default:
                throw new InvalidChoiceException("없는 메뉴 입니다 ." + choice);
        }

    }
}
