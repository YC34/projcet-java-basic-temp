package application.menu.firstmenu.secondmenu.thirdmenu;

import application.exception.InvalidChoiceException;
import application.menu.common.Menu;
import application.menu.firstmenu.secondmenu.UsaMenu;
import application.program.travle.model.Spot;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class USpotMenu implements Menu {
    private Scanner scanner;
    private List<String> options;
    private Spot spot;

    public USpotMenu (Scanner scanner){
        this.scanner = scanner;
        this.options = Arrays.asList("(N)ewyork", "(L)asvegas", "(H)awai", "L(A)", "(B)ack", "(E)xit");
        this.spot = new Spot();
    }


    @Override
    public void display() {
        System.out.println("해당국가의 도시를 선택하세요");
        for(String a : options){
            System.out.println(a);
        }
    }

    @Override
    public Menu execute(String choice) throws InvalidChoiceException, IOException {
        switch (choice.toUpperCase()){
            case "N" :
                System.out.println("Newyork을 선택하셨습니다.");
                System.out.println();
                spot.showNewyork();
                break;
            case "L" :
                System.out.println("Las vegas를 선택하셨습니다.");
                System.out.println();
                spot.showLasvegas();
                break;
            case "A" :
                System.out.println("LA를 선택하셨습니다.");
                System.out.println();
                spot.showLa();
                break;
            case "H" :
                System.out.println("Hawai를 선택하셨습니다.");
                System.out.println();
                spot.showHawai();
                break;
            case "B":
                System.out.println("이전 메뉴로 돌아갑니다.");
                return new UsaMenu(scanner);
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
