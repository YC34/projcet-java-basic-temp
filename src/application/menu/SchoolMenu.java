package application.menu;

import application.exception.InvalidChoiceException;
import application.program.school.School;
import application.program.school.data.MakeData;
import application.program.school.report.GenerateGradeReport;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SchoolMenu implements Menu{
    private Scanner scanner;
    private List<String> options;
    private MakeData data;
    private GenerateGradeReport generateGradeReport;


    public SchoolMenu(Scanner scanner) {
        this.scanner = scanner;
        this.options = Arrays.asList("(I)nfo 학생들의 인적사항","(B)ack 메인 메뉴로","(E)xit 종료");
        this.data = new MakeData();
        this.generateGradeReport = new GenerateGradeReport();
    }

    @Override
    public void display() {
        System.out.println("학생정보 시스템을 선택하셨습니다.");
        for(String option: options){
            System.out.println(option);
        }

    }

    @Override
    public Menu execute(String choice) throws InvalidChoiceException {
        switch (choice.toUpperCase()) {
            case "I":
                data.createSubject();
                data.createStudent();
                String report = generateGradeReport.getReport();
                System.out.println(report);
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
