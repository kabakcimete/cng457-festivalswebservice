package com.example.festivalswebservice.service;

import com.example.festivalswebservice.model.FestivalRun;
import com.example.festivalswebservice.model.OtherActivity;
import com.example.festivalswebservice.model.Performer;
import com.example.festivalswebservice.repository.OtherActivityRepository;
import com.example.festivalswebservice.repository.PerformerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerformerService {
    @Autowired
    PerformerRepository performerRepository;

    /**
     * This method is for adding the given Performer
     * @param p Performer object
     * @return Performer
     */
    public Performer savePerformer(Performer p){
        return performerRepository.save(p);
    }
}
