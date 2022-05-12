package com.example.festivalswebservice.repository;

import com.example.festivalswebservice.model.Festival;
import com.example.festivalswebservice.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository  extends JpaRepository<Show, Integer> {
}
