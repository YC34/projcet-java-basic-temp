package application.program.parking.data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataPreprocessor {
    private Map<Integer,List<String>> data = new HashMap<>();
    //    private long ms = System.currentTimeMillis();
    public DataPreprocessor() {
    }

    public Map<Integer,List<String> > getParkingInfoMap(List<String> rawData) throws IOException {
//            System.out.println("start getParkingInfoMap");
               // key 순서대로 저장. 데이터중 원하는 인덱스에서만 추출
            Integer temp ;

            for (String key : rawData){
                temp =Integer.parseInt(key.split(",")[1].trim());
                List<String> tempList = new ArrayList<>();
                tempList.add(key.split(",")[2].trim());
                tempList.add(key.split(",")[3].trim());
                tempList.add(key.split(",")[4].trim());
                tempList.add(key.split(",")[5].trim());
                tempList.add(key.split(",")[7].trim());
                tempList.add(key.split(",")[8].trim());
                tempList.add(key.split(",")[28].trim());
                tempList.add(key.split(",")[25].trim());
                tempList.add(key.split(",")[24].trim());
                data.put(temp,tempList);
            }
//            System.out.println(System.currentTimeMillis() - ms+" ms 걸림.") ;
        return data;
    }


}
