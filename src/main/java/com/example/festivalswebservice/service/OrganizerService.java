package com.example.festivalswebservice.service;


import com.example.festivalswebservice.model.Organizer;
import com.example.festivalswebservice.repository.OrganizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizerService {
    @Autowired
    OrganizerRepository organizerRepository;

    /**
     * This method is for adding Organizer
     * @param o Organizer object
     * @return Organizer is returned
     */
    public Organizer saveOrganizer(Organizer o){
        return organizerRepository.save(o);
    }

    public List<Organizer> organiserSearch(String d){
        return organizerRepository.findByEmailContainsOrFnameContainsAndLnameContainsOrEmailContains(d);
    }

    public List<Organizer> organisersWithMultipleRuns(){
        return organizerRepository.organisersWithMultipleRuns();
    }
}
