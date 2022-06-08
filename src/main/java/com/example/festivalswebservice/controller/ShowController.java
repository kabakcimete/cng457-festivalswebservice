package com.example.festivalswebservice.controller;

import com.example.festivalswebservice.model.Shows;
import com.example.festivalswebservice.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShowController {
    @Autowired
    ShowService showService;

    /**
     *
     * @param s is the show that is going to be added
     * @return object that is added
     */
    @PostMapping("/addshow")
    public Shows saveShow(@RequestBody Shows s){
        return showService.saveShow(s);
    }

    @GetMapping("/crowdedshows")
    public List<Shows> maxPerformers(){
        return showService.maxPerformers();
    }
}
