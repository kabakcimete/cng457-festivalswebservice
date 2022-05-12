package com.example.festivalswebservice.controller;
import com.example.festivalswebservice.model.Concert;
import com.example.festivalswebservice.model.Organizer;
import com.example.festivalswebservice.service.OrganizerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrganizerController {
    @Autowired
    OrganizerService organizerService;

    @PostMapping("/addorganizer")
    public Organizer saveOrganizer(@RequestBody Organizer o){
        return organizerService.saveOrganizer(o);
    }
}
