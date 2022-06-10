package com.example.festivalswebservice.controller;


import com.example.festivalswebservice.model.Performer;
import com.example.festivalswebservice.model.Shows;
import com.example.festivalswebservice.service.PerformerService;
import com.example.festivalswebservice.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;



import java.util.List;

@RestController
public class PerformerController {
    @Autowired
    PerformerService performerService;

    /**
     *
     * @param p is the show that is going to be added
     * @return object that is added
     */
    @PostMapping("/addperformer")
    public Performer savePerformer(@RequestBody Performer p){
        return performerService.savePerformer(p);
    }
}
