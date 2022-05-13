package com.example.festivalswebservice.controller;

import com.example.festivalswebservice.model.Show;
import com.example.festivalswebservice.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
    public Show saveShow(@RequestBody Show s){
        return showService.saveShow(s);
    }
}
