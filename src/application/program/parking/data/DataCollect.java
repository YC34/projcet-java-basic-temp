package application.program.parking.data;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FileReader와 BufferedReader로 csv파일 읽어오기.
 */

public class DataCollect {

    private List<String> rawData;
    public DataCollect() {
        this.rawData = new ArrayList<>();
    }

    /**
     *
     * @param path
     * @return csv to java
     * @throws IOException
     */
    public List<String> dataCollect(String path) throws IOException {
        try(FileReader fileReader = new FileReader(path);
            BufferedReader br = new BufferedReader(fileReader)){
                String line;
                boolean isFirstLine =true;
                while((line= br.readLine())!=null){
                    if (isFirstLine) {
                        isFirstLine = false; // 첫 번째 줄을 건너뜀
                        continue;
                    }

                    rawData.add(line);
                }
        }
        return  rawData;
    }
}
