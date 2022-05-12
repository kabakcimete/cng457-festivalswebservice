package com.example.festivalswebservice.repository;

import com.example.festivalswebservice.model.Concert;
import com.example.festivalswebservice.model.Festival;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConcertRepository  extends JpaRepository<Concert, Integer> {
}
