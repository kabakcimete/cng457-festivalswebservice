package com.example.festivalswebservice.service;

import com.example.festivalswebservice.model.FestivalRun;
import com.example.festivalswebservice.model.OtherActivity;
import com.example.festivalswebservice.repository.OtherActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OtherActivityService {
    @Autowired
    OtherActivityRepository otherActivityRepository;

    /**
     * This method is for adding the given OtherActivity
     * @param o OtherActivity object
     * @return OtherActivity
     */
    public OtherActivity saveOtherActivity(OtherActivity o){
        return otherActivityRepository.save(o);
    }
}
