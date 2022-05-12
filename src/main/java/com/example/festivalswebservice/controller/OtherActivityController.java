package com.example.festivalswebservice.controller;

import com.example.festivalswebservice.model.OtherActivity;
import com.example.festivalswebservice.service.OtherActivityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OtherActivityController {
    @Autowired
    OtherActivityService otherActivityService;

    @PostMapping("/addotheractivity")
    public OtherActivity saveOtherActivity(@RequestBody OtherActivity o){
        return otherActivityService.saveOtherActivity(o);
    }
}
