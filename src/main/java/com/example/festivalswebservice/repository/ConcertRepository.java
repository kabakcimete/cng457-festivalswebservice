package com.example.festivalswebservice.repository;

import com.example.festivalswebservice.model.Concert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConcertRepository  extends JpaRepository<Concert, Integer> {

    public List<Concert> findByDescriptionContains(String d);


}
