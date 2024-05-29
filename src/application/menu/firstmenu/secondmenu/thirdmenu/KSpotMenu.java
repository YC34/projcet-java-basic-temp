package application.menu.firstmenu.secondmenu.thirdmenu;

import application.exception.InvalidChoiceException;
import application.menu.common.Menu;
import application.menu.firstmenu.secondmenu.KoreaMenu;
import application.program.travle.model.Spot;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class KSpotMenu implements Menu {
    private Scanner scanner;
    private List<String> options;
    private Spot spot;

    public KSpotMenu (Scanner scanner){
        this.scanner = scanner;
        this.options = Arrays.asList("(S)eoul", "b(U)san", "(I)ncheon", "(J)eju", "(B)ack", "(E)xit");
        this.spot = new Spot();
    }


    @Override
    public void display() {
        System.out.println();
        System.out.println("도시를 선택하세요");
        for(String a : options){
            System.out.println(a);
        }
    }

    @Override
    public Menu execute(String choice) throws InvalidChoiceException, IOException {
        switch (choice.toUpperCase()){
            case "S" :
                System.out.println("Seoul을 선택하셨습니다.");
                System.out.println();
                spot.showSeoul();
                break;
            case "U" :
                System.out.println("Busan을 선택하셨습니다.");
                System.out.println();
                spot.showBusan();
                break;
            case "I" :
                System.out.println("Incheon을 선택하셨습니다.");
                System.out.println();
                spot.showIncheon();
                break;
            case "J" :
                System.out.println("Jeju를 선택하셨습니다.");
                System.out.println();
                spot.showJeju();
                break;
            case "B":
                System.out.println("이전 메뉴로 돌아갑니다.");
                return new KoreaMenu(scanner);
            case "E":
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            default:
                throw new InvalidChoiceException("잘못된 입력 입니다 . [" + choice + "]");
        }
        System.out.println();
        return this;
    }
}
