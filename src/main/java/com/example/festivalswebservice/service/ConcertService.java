package com.example.festivalswebservice.service;

import com.example.festivalswebservice.model.Concert;
import com.example.festivalswebservice.repository.ConcertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
