package com.example.festivalswebservice.controller;

import com.example.festivalswebservice.model.Festival;
import com.example.festivalswebservice.model.FestivalRun;
import com.example.festivalswebservice.service.FestivalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FestivalController {
    @Autowired
    FestivalService festivalService;

    /**
     *
     * @param f is the festival to be added
     * @return is the festival that is added
     */
    @PostMapping("/addfestival")
    public Festival saveFestival(@RequestBody Festival f){
        return festivalService.saveFestival(f);
    }

    /**
     *
     * @param festivalid is the festivalID using this pk we get the needed festival object
     * @return needed festival object is returned
     */
    @GetMapping("/getfestival/{festivalid}")
    public Festival getFestival(@PathVariable int festivalid){
        return festivalService.getFestival(festivalid);
    }

    /**
     *
     * @return all the festivals are returned
     */
    @GetMapping("/getallfestivals")
    public List<Festival> getAllFestival(){
        return festivalService.getAllFestival();
    }

    /**
     *
     * @param festivalid is the pk for festival
     * @return all the festivalruns with that given festivalid
     */
    @GetMapping("/getallfestivalruns/{festivalid}")
    public List<FestivalRun> getAllFestivalRuns(@PathVariable int festivalid){
        return festivalService.getAllFestivalRuns(festivalid);
    }

    /**
     *
     * @param city is an attribute for festival class
     * @return all the festivals with the given city name
     */
    @GetMapping("/getfestivalsforacity/{city}")
    public List<Festival> getFestivalsForACity(@PathVariable String city){
        return festivalService.getFestivalsForACity(city);
    }
}

