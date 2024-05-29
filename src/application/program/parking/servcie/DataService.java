package application.program.parking.servcie;

import application.program.parking.data.DataCollect;
import application.program.parking.dto.DataDto;

import java.io.IOException;
import java.util.*;

/**
 * 전반적인 service 로직이 있는 클래스
 */

public class DataService {
    private DataDto dataDto;
    private DataCollect dataCollect;
    private final String path ="/Users/y_chan/study/java-project/java/project/first/src/application/program/parking/data/parkingInfo.csv";

    public DataService() {
        this.dataDto = new DataDto();
        this.dataCollect = new DataCollect();
    }

    /**
     *
     * @return DataDto 객체
     * @throws IOException
     */
    public DataDto getDataDto() throws IOException{
        this.dataDto.setDataList(dataCollect.dataCollect(path));
        return dataDto;
    }

    public Map<Integer, List<String>> dataPreprocessor() throws IOException{
        List<String> list = getDataDto().getDataList();
        Integer temp ;
        Map<Integer,List<String>> data = new HashMap<>();
        for (String key : list){
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
        return data;
    }

    /**
     *
     * @return DataDto에서 뽑아낸 데이터를 String으로 반환.
     * @throws IOException
     */
    public String info() throws IOException {
        Map<Integer,List<String>> preprocessorData = dataPreprocessor();
        StringBuffer sb = new StringBuffer();
        String line = "==============================================================================";
        String head = "|주차장 관리 번호 | 주차장명 | 구분 | 유형 | 주소 | 구획수 | 관리기관 | 1달요금 | 하루 요금";
        sb.append(line+"\n");
        sb.append("금천구 주차장 정보 \n");
        sb.append(head);
        Iterator<Integer> keys = preprocessorData.keySet().iterator();
        while (keys.hasNext()) {
            Integer key = keys.next();
            List<String> values = preprocessorData.get(key);
                sb.append("\n").append(values);
        }
       sb.append("\n");
       sb.append(line);
     return sb.toString();
    }


    public String freeZone() throws IOException {
        Map<Integer,List<String>> preprocessorData = dataPreprocessor();
        StringBuffer sb = new StringBuffer();
        String line = "==============================================================================";
        String head = "|주차장 관리 번호 | 주차장명 | 구분 | 유형 | 주소 | 구획수 | 관리기관 | 1달요금 | 하루 요금";
        sb.append(line+"\n");
        sb.append("금천구 1일 무료 주차장 정보 \n");
        sb.append(head);
        Iterator<Integer> keys = preprocessorData.keySet().iterator();
        while (keys.hasNext()) {
            Integer key = keys.next();
            List<String> values = preprocessorData.get(key);
            if(values.get(8).equals("0.0") || values.get(8).equals("")){
                sb.append("\n").append(values);
            }
        }
        sb.append("\n");
        sb.append(line);
        return sb.toString();
    }

    public String summary() throws IOException {
        Map<Integer,List<String>> preprocessorData = dataPreprocessor();
        double total =0.0;
        double average;
        int count =0;
        StringBuffer sb = new StringBuffer();
        String line = "==============================================================================";
        String head = "| 금천구 주차장 수 | 하루 평균 가격 |";
        sb.append(line+"\n");
        sb.append("요약 정보 \n");
        sb.append(head+"\n");
        Iterator<Integer> keys = preprocessorData.keySet().iterator();
        while (keys.hasNext()) {
            Integer key = keys.next();
            List<String> values = preprocessorData.get(key);
            if(!(values.get(8).equals("0.0") || values.get(8).equals(""))){
                total += Double.parseDouble(values.get(8));
                count++;
            }
        }
        average = total / count;
        sb.append(preprocessorData.size()).append("개의 주차장이 있습니다. ").append(String.format("%.2f", average)).append("원 입니다.(소수점 2째자리에서 반올림)\n");
        sb.append("\n");
        sb.append(line);
        return sb.toString();


    }

}
