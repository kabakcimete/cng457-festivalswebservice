package com.example.festivalswebservice.repository;


import com.example.festivalswebservice.model.Performer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PerformerRepository extends JpaRepository<Performer, Integer> {

}