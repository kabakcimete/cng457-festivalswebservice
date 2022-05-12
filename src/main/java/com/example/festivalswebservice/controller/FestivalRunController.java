package com.example.festivalswebservice.controller;

import com.example.festivalswebservice.model.Concert;
import com.example.festivalswebservice.model.Festival;
import com.example.festivalswebservice.model.FestivalRun;
import com.example.festivalswebservice.service.FestivalRunService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FestivalRunController {
    @Autowired
    FestivalRunService festivalRunService;

    @PostMapping("/addfestivalrun")
    public FestivalRun saveFestivalRun(@RequestBody FestivalRun f){
        return festivalRunService.saveFestivalRun(f);
    }

    @GetMapping("/getfestivalrun{festivalrunid}")
    public FestivalRun getFestivalRun(@PathVariable int festivalrunid){
        return festivalRunService.getFestivalRun(festivalrunid);
    }
    @GetMapping("/getshortfestivalrun/{duration}")
    public List<FestivalRun> getShortFestivalRun(@PathVariable int duration){
        return festivalRunService.getShortFestivalRun(duration);
    }

}
