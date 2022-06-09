package com.example.festivalswebservice.repository;

import com.example.festivalswebservice.model.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrganizerRepository  extends JpaRepository<Organizer, String> {

    public List<Organizer> findByEmailStartingWithOrFnameContainsOrLnameContainsOrPhoneEquals(String key1,String key2,String key3,String key4);

    @Query("SELECT o FROM Organizer o WHERE o.festivals.size<1")
    public List<Organizer> organisersWithMultipleRuns();

}
