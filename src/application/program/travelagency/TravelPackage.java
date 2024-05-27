package application.program.travelagency;

import java.util.ArrayList;

public class TravelPackage {
    private String packageName;
    private String[] destinations;
    private int costPerPerson;
    private ArrayList<String> travelers;

    public TravelPackage(String packageName, String[] destinations, int costPerPerson) {
        this.packageName = packageName;
        this.destinations = destinations;
        this.costPerPerson = costPerPerson;
        this.travelers = new ArrayList<>();
    }

    public void addTravelers(String[] travelerNames) {
        for (String name : travelerNames) {
            travelers.add(name);
        }
    }

    public void printReport() {
        StringBuilder report = new StringBuilder();
        report.append("----------------------------------------------\n");
        report.append(packageName).append(" 여행 코스\n");
        for (String destination : destinations) {
            report.append(destination).append(", ");
        }
        report.setLength(report.length() - 2); // Remove the last comma
        report.append("\n1인당 여행 경비: ").append(costPerPerson).append("만원\n\n");
        report.append("여행자 명단\n");
        for (String traveler : travelers) {
            report.append(traveler).append("\n");
        }
        report.append("\n총 여행자 금액: ").append(costPerPerson * travelers.size()).append("만원\n");
        report.append("----------------------------------------------\n");

        System.out.println(report.toString());
    }
}
