package application.menu.firstmenu;

import application.exception.InvalidChoiceException;
import application.menu.MainMenu;
import application.menu.common.Menu;
import application.program.travelagency.TravelAgency;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TravelMenu implements Menu {

    private Scanner scanner;
    private List<String> options;
    private TravelAgency travelAgency ;

    public TravelMenu(Scanner scanner) {
        this.scanner = scanner;
        this.options = Arrays.asList("(I)nfo 여행정보" ,"(B)ack 메인 메뉴로","(E)xit 종료");
        this.travelAgency =TravelAgency.getInstance();
    }

    @Override
    public void display() {
        System.out.println("여행정보 메뉴를 선택하셨습니다.");
        for (String option : options) {
            System.out.println(option);
        }
    }

    @Override
    public Menu execute(String choice) throws InvalidChoiceException {
        switch (choice.toUpperCase()) {
            case "I":
                travelAgency.createTravelPackages();
                travelAgency.createTravelers();
                travelAgency.printTravelReports();
                break;
            case "B":
                System.out.println("메인 메뉴로 돌아갑니다.");
                return new MainMenu(scanner);
            case "E":
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            default:
                throw new InvalidChoiceException("잘못된 입력 입니다 . [" + choice + "]");

        }
        return this;
    }
}
