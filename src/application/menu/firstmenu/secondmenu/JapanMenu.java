package application.menu.firstmenu.secondmenu;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import application.exception.InvalidChoiceException;
import application.menu.common.Menu;
import application.menu.firstmenu.CountryMenu;
import application.menu.firstmenu.secondmenu.thirdmenu.JSpotMenu;
import application.program.travle.model.Country;

public class JapanMenu implements Menu {
	private Scanner scanner;
	private List<String> options;
	private Country country;
	
	public JapanMenu(Scanner scanner) {
		this.scanner = scanner;
		this.options = Arrays.asList("(I)Info", "(C)ity", "(B)ack");
		this.country = new Country();
		
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
				country.getJapanInfo();
				break;
			case "C" :
				return new JSpotMenu(scanner);
			case "B" :
				return new CountryMenu(scanner);
			default:
				throw new InvalidChoiceException("없는 메뉴 입니다.");
		}
		return this;
	}
}
