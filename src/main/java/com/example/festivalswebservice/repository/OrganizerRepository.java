package com.example.festivalswebservice.repository;

import com.example.festivalswebservice.model.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrganizerRepository  extends JpaRepository<Organizer, String> {

    /**
     *
     * @param key1 the email keyword to be search from the srart
     * @param key2 the name keyword to be searched in first name
     * @param key3 the name keyword to be searched in last name
     * @param key4 the phone number to be searched for the organiser
     * @return a list of organiser with the given input variables
     */
    public List<Organizer> findByEmailStartingWithOrFnameContainsOrLnameContainsOrPhoneEquals(String key1,String key2,String key3,String key4);


    /**
     *
     * @return a list of organisers who have organised multiple festival runs
     */
    @Query("SELECT o FROM Organizer o WHERE o.festivals.size>1")
    public List<Organizer> organisersWithMultipleRuns();

}
