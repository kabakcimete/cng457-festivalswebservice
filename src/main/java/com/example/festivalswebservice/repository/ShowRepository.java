package com.example.festivalswebservice.repository;

import com.example.festivalswebservice.model.Shows;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository  extends JpaRepository<Shows, Integer> {


}
