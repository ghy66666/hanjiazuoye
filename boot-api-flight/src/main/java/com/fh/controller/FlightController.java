package com.fh.controller;

import com.fh.model.FlightQuery;
import com.fh.service.FlightService;
import com.fh.util.ResponseEnum;
import com.fh.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {
    @Autowired
    private FlightService flightService;



    @RequestMapping("pageselect")
    public ServerResponse pageselect(@RequestBody FlightQuery flightQuery){
        try {
            return flightService.pageselect(flightQuery);
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error(ResponseEnum.ERROR);
        }


    }


    @RequestMapping("selectType")
    public ServerResponse selectType(){
        try {
            return flightService.selectType();
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error(ResponseEnum.ERROR);
        }


    }

    @RequestMapping("selectCity")
    public ServerResponse selectCity(){
        try {
            return flightService.selectCity();
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error(ResponseEnum.ERROR);
        }


    }




}
