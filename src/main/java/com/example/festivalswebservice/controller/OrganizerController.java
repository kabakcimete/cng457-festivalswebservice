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

    @GetMapping("/organisersearch")
    public List<Organizer> organizerSearch(@RequestParam(name="key", required = true) String key){
        return organizerService.organiserSearch(key);
    }

    @GetMapping("/organiserswithmultipleruns")
    public List<Organizer> organisersWithMultipleRuns(){
        return organizerService.organisersWithMultipleRuns();
    }

}
