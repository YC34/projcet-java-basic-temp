package application.menu.firstmenu.secondmenu.thirdmenu;

import application.exception.InvalidChoiceException;
import application.menu.common.Menu;
import application.menu.firstmenu.secondmenu.JapanMenu;
import application.program.travle.model.Spot;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JSpotMenu implements Menu {
    private Scanner scanner;
    private List<String> options;
    private Spot spot;

    public JSpotMenu (Scanner scanner){
        this.scanner = scanner;
        this.options = Arrays.asList("(T)okyo", "(O)saka", "(H)otkaido", "o(K)inawa", "(B)ack", "(E)xit");
        this.spot = new Spot();
    }


    @Override
    public void display() {
        System.out.println("도시를 선택하세요");
        for(String a : options){
            System.out.println(a);
        }
    }

    @Override
    public Menu execute(String choice) throws InvalidChoiceException, IOException {
        switch (choice.toUpperCase()){
            case "T" :
                System.out.println("Tokyo를 선택하셨습니다.");
                spot.showTokyo();
                break;
            case "O" :
                System.out.println("Osaka를 선택하셨습니다.");
                spot.showOsaka();
                break;
            case "K" :
                System.out.println("Okinawa를 선택하셨습니다.");
                spot.showOkinawa();
                break;
            case "H" :
                System.out.println("Hotkaido를 선택하셨습니다.");
                spot.showHotkaido();
                break;
            case "B":
                System.out.println("이전 메뉴로 돌아갑니다.");
                return new JapanMenu(scanner);
            case "E":
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            default:
                throw new InvalidChoiceException("잘못된 입력 입니다 . [" + choice + "]");
        }
        return this;
    }
}
