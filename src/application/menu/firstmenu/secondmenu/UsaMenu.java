package application.menu.firstmenu.secondmenu;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import application.exception.InvalidChoiceException;
import application.menu.common.Menu;
import application.menu.firstmenu.CountryMenu;
import application.menu.firstmenu.secondmenu.thirdmenu.USpotMenu;
import application.program.travle.model.Country;

public class UsaMenu implements Menu {
	private Scanner scanner;
	private List<String> options;
	private Country country;
	
	
	
	public UsaMenu(Scanner scanner) {
		this.country = new Country();
		this.scanner = scanner;
		this.options = Arrays.asList("(I)Info", "(C)ity", "(B)ack");
	}

	@Override
	public void display() {
		System.out.println("메뉴를 입력 하세요.");
		for(String option : options) {
			System.out.println(option);
		}
	}

	@Override
	public Menu execute(String choice) throws InvalidChoiceException {
		switch (choice.toUpperCase()) {
			case "I" :
				country.getUsaInfo();
				break;
			case "C" :
				return new USpotMenu(scanner);
			case "B" :
				return new CountryMenu(scanner);
			default:
				throw new InvalidChoiceException("없는 메뉴 입니다.");
		}
		return this;
	}

}
