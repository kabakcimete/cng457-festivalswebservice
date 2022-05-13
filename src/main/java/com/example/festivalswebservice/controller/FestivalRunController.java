package com.example.festivalswebservice.controller;

import com.example.festivalswebservice.model.FestivalRun;
import com.example.festivalswebservice.service.FestivalRunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FestivalRunController {
    @Autowired
    FestivalRunService festivalRunService;

    /**
     *
     * @param f is a festivalrun to be added
     * @return festivalrun to be added
     */
    @PostMapping("/addfestivalrun")
    public FestivalRun saveFestivalRun(@RequestBody FestivalRun f){
        return festivalRunService.saveFestivalRun(f);
    }

    /**
     *
     * @param festivalrunid is a pk for festivalrun entity
     * @return festivalrun instance with given festivalrunid
     */

    @GetMapping("/getfestivalrun{festivalrunid}")
    public FestivalRun getFestivalRun(@PathVariable int festivalrunid){
        return festivalRunService.getFestivalRun(festivalrunid);
    }

    /**
     *
     * @param duration is a attribute for festivalrun entitiy
     * @return the festivalruns which duration is shorter than given parameter
     */
    @GetMapping("/getshortfestivalrun/{duration}")
    public List<FestivalRun> getShortFestivalRun(@PathVariable int duration){
        return festivalRunService.getShortFestivalRun(duration);
    }

}
