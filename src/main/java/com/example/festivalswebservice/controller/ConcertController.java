package com.example.festivalswebservice.controller;

import com.example.festivalswebservice.model.Concert;
import com.example.festivalswebservice.service.ConcertService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConcertController {
    @Autowired
    ConcertService concertService;

    /**
     *
     * @param c is the concert to be added
     * @return the concert that are added
     */
    @PostMapping("/addconcert")
    public Concert saveConcert(@RequestBody Concert c){
        return concertService.saveConcert(c);
    }
}
