package application.menu;

import application.exception.InvalidChoiceException;
import application.menu.common.Menu;
import application.program.parking.model.ParkingInfo;
import application.program.travelagency.TravelAgency;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ParkZoneMenu implements Menu {

    private Scanner scanner;
    private List<String> options;
    private ParkingInfo parkingInfo;

    public ParkZoneMenu(Scanner scanner) throws IOException {
        this.scanner = scanner;
        this.options = Arrays.asList("(I)nfo 금천구 주자장 정보" ,"(F)ree Zone","(S)ummary","(B)ack 메인 메뉴로","(E)xit 종료");
        this.parkingInfo = new ParkingInfo(scanner);
    }

    @Override
    public void display() {
        for (String option : options) {
            System.out.println(option);
        }
    }

    @Override
    public Menu execute(String choice) throws InvalidChoiceException{
        switch (choice.toUpperCase()) {
            case "I":
                this.parkingInfo.info();
                break;
            case "F":
                this.parkingInfo.freeZone();
                break;
            case "S":
                this.parkingInfo.summary();
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
