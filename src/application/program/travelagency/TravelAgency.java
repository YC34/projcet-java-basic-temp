
package application.program.travelagency;

import java.util.ArrayList;



public class TravelAgency {
    private static TravelAgency instance ;
    private ArrayList<TravelPackage> travelPackages = new ArrayList<>();

    private TravelAgency() {}

    public static TravelAgency getInstance() {
        if(instance ==null){
            instance = new TravelAgency();
        }
        return instance;
    }

    public void createTravelPackages() {
        TravelPackage osaka = new TravelPackage("일본 오사카 3박 4일", new String[]{"도톤보리", "츠텐카쿠", "오사카성", "유니버셜 스튜디오"}, 130);
        TravelPackage swiss = new TravelPackage("스위스 5박 6일", new String[]{"루체른", "인터라켄", "융프라우", "취리히"}, 350);
        TravelPackage thailand = new TravelPackage("태국 3박 4일", new String[]{"방콕", "치앙마이", "푸켓", "아유타야"}, 165);
        TravelPackage la = new TravelPackage("미국 로스엔젤레스 9박 11일", new String[]{"할리우드 사인", "그리피스 천문대", "오리지널 파머스 마켓", "앤젤스 플라이트 레일웨이"}, 500);

        travelPackages.add(osaka);
        travelPackages.add(swiss);
        travelPackages.add(thailand);
        travelPackages.add(la);
    }

    public void createTravelers() {
        travelPackages.get(0).addTravelers(new String[]{"김민준", "박예준", "조은서", "이사랑"});
        travelPackages.get(1).addTravelers(new String[]{"배지민", "남지호", "송하은"});
        travelPackages.get(2).addTravelers(new String[]{"신지훈", "서지우"});
        travelPackages.get(3).addTravelers(new String[]{"윤서준", "한서연", "강지후", "황민재", "남지호"});
    }

    public void printTravelReports() {
        for (TravelPackage travelPackage : travelPackages) {
            travelPackage.printReport();
        }
    }
}
