package application.program.parking.model;



import application.program.parking.data.DataCollect;
import application.program.parking.data.DataPreprocessor;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ParkingInfo {
    private static final String path ="/Users/y_chan/study/java-project/java/project/first/src/application/program/parking/data/parkingInfo.csv";
//    private String parkNumber; // 주차장 관리 번호
//    private String parkName; // 주차장명
//    private String parkGubun; // 주차장 구분
//    private String parkCase; // 주차장 유형
//    private String parkAddress; // 주차장 주소
//    private String parkCount; // 주차 구획수
//    private String parkCompnay; // 관리 기관명
//    private String parkPerMonth; // 월 정기권
//    private String parkPerDay; // 1일 주차 요금
    private DataPreprocessor data; // 데이터 정제 클래스
    private DataCollect dataCollect; // 데이터 수집 클래스
    private Map<Integer , List<String>> reportMap; // 정제된 데이터 key,value가 있는 맵
    private List<String> rawData; //
    private Scanner scanner;

    public ParkingInfo(Scanner scanner) throws IOException{
        this.scanner = scanner;
        this.dataCollect = new DataCollect();
        this.data = new DataPreprocessor();
        this.rawData = this.dataCollect.dataCollect(ParkingInfo.path);
        this.reportMap = this.data.getParkingInfoMap(rawData);
    }

    public void info(){
        System.out.println("주자창 정보 ");
        Iterator<Integer> keys = this.reportMap.keySet().iterator();
        while(keys.hasNext()){
            Integer key = keys.next();
            List<String> values = this.reportMap.get(key);
            System.out.println(values);
        }
    }


    // 1일 무료 주차장 정보.
    public void freeZone() {
        System.out.println("1일 무료 주차장 정보.");
       Iterator<Integer> keys = this.reportMap.keySet().iterator();
       while (keys.hasNext()) {
           Integer key = keys.next();
           List<String> values = this.reportMap.get(key);
           if(values.get(8).equals("0.0") || values.get(8).equals("")){
               System.out.println(values);
           }
       }

    }


    // 요약 정보.
    public void summary(){
        System.out.println("금천구 주차장 수 : "+this.reportMap.size());
        double total =0.0;
        double average;
        int count =0;
        Iterator<Integer> keys = this.reportMap.keySet().iterator();
        while (keys.hasNext()) {
            Integer key = keys.next();
            List<String> values = this.reportMap.get(key);
            if(!(values.get(8).equals("0.0") || values.get(8).equals(""))){
                total += Double.parseDouble(values.get(8));
                count++;
            }
        }
        average = total / count;
        System.out.printf("하루 평균 가격은 : %.0f 원 입니다.",average);

    }

//
//    public String search(String search) {
//
//    }

//    public static void main(String[] args) throws IOException {
//        ParkingInfo pain = new ParkingInfo(new Scanner(System.in));
//        pain.freeZone();
//        pain.summary();
//
//    }

}
