package application.program.parking.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * rawData를 담아주는 클래스
 */

public class DataDto {
    // 불러 들인 데이터를 옮겨주는 역할.
    private List<String> DataList = new ArrayList<>();
    public List<String> getDataList() {
        return DataList;
    }
    public void setDataList(List<String> dataList) {
        DataList = dataList;
    }
}
