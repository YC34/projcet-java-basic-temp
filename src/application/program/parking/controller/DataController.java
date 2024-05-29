package application.program.parking.controller;

import application.program.parking.servcie.DataService;

import java.io.IOException;

/**
 * 요청에 응답해줄 클래스
 */
public class DataController {
    private DataService service;
    private String result;

    public DataController() {
        this.service = new DataService();
    }

    public String getInfo() throws IOException {
        result = service.info();
        return result;
    }

    public String getFreeZone() throws IOException{
        result = service.freeZone();
        return result;
    }
    public String getSummary() throws IOException{
        result = service.summary();
        return result;
    }


}
