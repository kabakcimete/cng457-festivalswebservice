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

    /**
     *
     * @param d is tthe keyword for first name or second name or phone or email
     * @return a list of organisers who have names with the given keyword or phone number or who have an email address which begins with the given keyword
     */

    public List<Organizer> organiserSearch(String d){
        return organizerRepository.findByEmailStartingWithOrFnameContainsOrLnameContainsOrPhoneEquals(d,d,d,d);
    }

    /**
     *
     * @return a list of organisers who have organised multiple festival runs
     */
    public List<Organizer> organisersWithMultipleRuns(){
        return organizerRepository.organisersWithMultipleRuns();
    }
}
