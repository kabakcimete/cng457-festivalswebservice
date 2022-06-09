package com.example.festivalswebservice.controller;

import com.example.festivalswebservice.model.Concert;
import com.example.festivalswebservice.model.Shows;
import com.example.festivalswebservice.service.ConcertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    /**
     *
     * @param key is the keyword to be searched
     * @return a list of concert whose description contains the given keyword
     */
    @GetMapping("/concertsbydescription")
    public List<Concert> findByDescriptionContains(@RequestParam(name="key", required = true) String key){
    return concertService.findByDescriptionContains(key);
    }

    /**
     *
     * @return a list of concert with the longest duration
     */
    @GetMapping("/longestconcerts")
    public List<Concert> longestConcert(){
        return concertService.longestConcert();
    }
}
