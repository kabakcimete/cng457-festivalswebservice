package com.example.festivalswebservice.repository;

import com.example.festivalswebservice.model.Concert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConcertRepository  extends JpaRepository<Concert, Integer> {

    /**
     *
     * @param d is the keyword to be searched
     * @return a list of concert which have the given keyword in their descriptions
     */
    public List<Concert> findByDescriptionContains(String d);


}
