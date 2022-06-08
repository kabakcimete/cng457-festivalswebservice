package com.example.festivalswebservice.service;

import com.example.festivalswebservice.model.Concert;
import com.example.festivalswebservice.model.Shows;
import com.example.festivalswebservice.repository.ConcertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConcertService {
    @Autowired
    ConcertRepository concertRepository;

    /**
     * This method is for adding concert
     * @param c Concert object to be saved
     * @return returns Concert object that is saved
     */
    public Concert saveConcert(Concert c){
        return concertRepository.save(c);
    }

    public List<Concert> findByDescriptionContains(String d){
        return concertRepository.findByDescriptionContains(d);
    }

    public List<Concert> longestConcert(){
        int longestConcerts = -1;
        ArrayList<Concert> results = new ArrayList<>();
        List<Concert> concerts = concertRepository.findAll();
        for(Concert  availableconcert: concerts){
            int duration =availableconcert.getDuration();
            if(longestConcerts < duration){
                longestConcerts = duration;
                if(!results.isEmpty()) {
                    results.clear();
                }
                results.add(availableconcert);
            }
            if(longestConcerts == duration){
                results.add(availableconcert);
            }

        }


        return results;
    }


}
