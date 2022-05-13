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

    /**
     *
     * @param o is the otheractivity that is going to be added
     * @return otheractivity instance that is added
     */
    @PostMapping("/addotheractivity")
    public OtherActivity saveOtherActivity(@RequestBody OtherActivity o){
        return otherActivityService.saveOtherActivity(o);
    }
}
