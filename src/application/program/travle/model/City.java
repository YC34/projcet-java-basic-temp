package application.program.travle.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class City {
    private String cityname;
    List<String> cities = Arrays.asList("Tokyo", "Osaka", "Hotkaido", "Okinawa", "Seoul", "Busan", "Incheon", "Jeju", "NewYork", "LA", "Hawai", "LasVegas");
//    List<String> arr2 = Arrays.asList("Seoul", "Busan", "Incheon", "Jeju");
//    List<String> arr3 = Arrays.asList("NewYork", "California", "LA", "Texas");
    private List<String> arrayList = new ArrayList<String>();




    public List<String> getArrayList() {
        return arrayList;
    }

    public void setArrayList(List<String> arrayList) {
        this.arrayList = arrayList;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public void add(String cityname){
        arrayList.add(cityname);
    }

    public void showKorea () {
        for (int i=4; i<8; i++){
            System.out.println(cities.get(i));
        }
    }
    public void showJapan(){
        for(int i=0; i<4;i++){
            System.out.println(cities.get(i));
        }
    }

    public void showUSA(){
        for (int i = 8; i<12;i++){
            System.out.println(cities.get(i));
        }
    }

//    public void showJapan() {
//        for (String b : arr1) {
//            System.out.println(b);
//        }
//    }
//
//    public void showUSA(){
//        for (String c : arr3) {
//            System.out.println(c);
//        }
//    }
}