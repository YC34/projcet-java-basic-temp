package application.menu.firstmenu;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import application.exception.InvalidChoiceException;
import application.menu.MainMenu;
import application.menu.common.Menu;
import application.menu.common.MenuType;
import application.menu.firstmenu.secondmenu.JapanMenu;
import application.menu.firstmenu.secondmenu.KoreaMenu;
import application.menu.firstmenu.secondmenu.UsaMenu;

public class CountryMenu implements Menu {
	private Scanner scanner;
	private List<String> options;
	
	public CountryMenu(Scanner scanner) {
		this.scanner = scanner;
		this.options = Arrays.asList("(U)sa", "(J)apan", "(K)orea", "(B)ack"); 
	}
	
	@Override
	public void display() {
		System.out.println("메뉴를 입력 하세요.");
		for(String option : options) {
			System.out.println(option);
		}
	}
	
	@Override
	public Menu execute(String choice) throws InvalidChoiceException{
		switch (choice.toUpperCase()) {
		case "U":
			return new UsaMenu(scanner);
		case "J":
			return new JapanMenu(scanner);
		case "K":
			return new KoreaMenu(scanner);
		case "B":
			return new MainMenu(scanner);
	
		default:
			throw new InvalidChoiceException("없는 메뉴 입니다." + choice);
		}
	}
	
}
