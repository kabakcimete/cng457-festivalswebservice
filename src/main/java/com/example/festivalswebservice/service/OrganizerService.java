package com.example.festivalswebservice.service;


import com.example.festivalswebservice.model.FestivalRun;
import com.example.festivalswebservice.model.Organizer;
import com.example.festivalswebservice.repository.OrganizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizerService {
    @Autowired
    OrganizerRepository organizerRepository;

    public Organizer saveOrganizer(Organizer o){
        return organizerRepository.save(o);
    }
}
