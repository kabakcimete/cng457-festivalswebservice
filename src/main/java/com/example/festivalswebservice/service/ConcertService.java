package com.example.festivalswebservice.service;

import com.example.festivalswebservice.model.Concert;
import com.example.festivalswebservice.repository.ConcertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConcertService {
    @Autowired
    ConcertRepository concertRepository;

    public Concert saveConcert(Concert c){
        return concertRepository.save(c);
    }

}
