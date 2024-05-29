package application.program.travle.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Spot {
    private String place;
    private List<String> ls1 = new ArrayList<>();
    List<String> seoul = Arrays.asList("남산", "롯데월드", "홍대", "강남");
    List<String> busan = Arrays.asList("해운대", "광안리", "서면", "남포동");
    List<String> incheon = Arrays.asList("구월동", "월미도", "영종도", "부평");
    List<String> jeju = Arrays.asList("애월", "성산", "표선", "연동");

    List<String> tokyo = Arrays.asList("도쿄타워", "신주쿠", "시부야", "가부키초");
    List<String> osaka = Arrays.asList("유니버설 스튜디오 재팬", "도톤보리", "우메다", "오사카성");
    List<String> hotkaido = Arrays.asList("삿포로", " 하코다테", "오타루", "아사히가와");
    List<String> okinawa = Arrays.asList("국제거리", "나하", "츄라우미 수족관", "아메리칸 빌리지");

    List<String> newyork = Arrays.asList("센트럴파크", "타임스스퀘어", "자유의 여신상", "브로드웨이");
    List<String> hawai = Arrays.asList("와이키키 해변", "다이아몬드 헤드", "이올라니 궁전", "화산 국립 공원");
    List<String> la = Arrays.asList("유니버셜 스튜디오 할리우드", "그리피스 천문대", "베니스 비치", "할리우드");
    List<String> lasvegas = Arrays.asList("프리몬트 길거리 체험구역", "라스베가스 하이롤러", "레드록 캐니언 국립 보존지구", "샤크리프 아쿠아리움");

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public List<String> getLs1() {
        return ls1;
    }

    public void setLs1(List<String> ls1) {
        this.ls1 = ls1;
    }

    public void showSeoul(){
        System.out.println("서울의 명소");
        for(String a : seoul){
            System.out.println(a);
        }
    }

    public void showBusan(){
        System.out.println("부산의 명소");
        for(String b : busan){
            System.out.println(b);
        }
    }

    public void showIncheon(){
        System.out.println("인천의 명소");
        for(String c : incheon){
            System.out.println(c);
        }
    }

    public void showJeju(){
        System.out.println("제주의 명소");
        for(String d : jeju){
            System.out.println(d);
        }
    }

    public void showTokyo(){
        System.out.println("도쿄의 명소");
        for(String e : tokyo){
            System.out.println(e);
        }
    }

    public void showOsaka(){
        System.out.println("오사카의 명소");
        for (String f : osaka){
            System.out.println(f);
        }
    }

    public void showOkinawa(){
        System.out.println("오키나와의 명소");
        for (String g : okinawa){
            System.out.println(g);
        }
    }

    public void showHotkaido(){
        System.out.println("홋카이도의 명소");
        for (String h : hotkaido){
            System.out.println(h);
        }
    }

    public void showLa(){
        System.out.println("LA의 명소");
        for (String i : la){
            System.out.println(i);
        }
    }

    public void showLasvegas(){
        System.out.println("라스베가스의 명소");
        for(String j : lasvegas){
            System.out.println(j);
        }
    }

    public void showNewyork(){
        System.out.println("뉴욕의 명소");
        for (String k : newyork){
            System.out.println(k);
        }
    }

    public void showHawai(){
        System.out.println("하와이의 명소");
        for (String l : hawai){
            System.out.println(l);
        }
    }




}
