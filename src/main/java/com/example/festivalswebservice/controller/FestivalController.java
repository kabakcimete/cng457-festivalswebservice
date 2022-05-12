package com.example.festivalswebservice.controller;

import com.example.festivalswebservice.model.Festival;
import com.example.festivalswebservice.model.FestivalRun;
import com.example.festivalswebservice.service.FestivalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class FestivalController {
    @Autowired
    FestivalService festivalService;

    @PostMapping("/addfestival")
    public Festival saveFestival(@RequestBody Festival f){
        return festivalService.saveFestival(f);
    }

    @GetMapping("/getfestival{festivalid}")
    public Festival getFestival(@PathVariable int festivalid){
        return festivalService.getFestival(festivalid);
    }

    @GetMapping("/getallfestivals")
    public List<Festival> getAllFestival(){
        return festivalService.getAllFestival();
    }
    @GetMapping("/getallfestivalruns/{festivalid}")
    public Set<FestivalRun> getAllFestivalRuns(@PathVariable int festivalid){
        return festivalService.getAllFestivalRuns(festivalid);
    }
    @GetMapping("/getfestivalsforacity/{city}")
    public List<Festival> getFestivalsForACity(@PathVariable String city){
        return festivalService.getFestivalsForACity(city);
    }
}

