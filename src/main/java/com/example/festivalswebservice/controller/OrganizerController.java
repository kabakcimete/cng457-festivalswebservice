package com.example.festivalswebservice.controller;

import com.example.festivalswebservice.model.Organizer;
import com.example.festivalswebservice.service.OrganizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrganizerController {
    @Autowired
    OrganizerService organizerService;

    /**
     *
     * @param o is an organizer to be added
     * @return organizer that are added
     */
    @PostMapping("/addorganiser")
    public Organizer saveOrganizer(@RequestBody Organizer o){
        return organizerService.saveOrganizer(o);
    }


    /**
     *
     * @param key is the keyword or a phone nummber to be searched
     * @return a list of organisers with names containing the given keyword or the phone number or the email which begins with the given keyword
     */
    @GetMapping("/organisersearch")
    public List<Organizer> organizerSearch(@RequestParam(name="key", required = true) String key){
        return organizerService.organiserSearch(key);
    }

    /**
     *
     * @return a list of organisers who habe organised multiple festival runs
     */
    @GetMapping("/organiserswithmultipleruns")
    public List<Organizer> organisersWithMultipleRuns(){
        return organizerService.organisersWithMultipleRuns();
    }

}
