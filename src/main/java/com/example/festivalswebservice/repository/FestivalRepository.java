package com.example.festivalswebservice.repository;

import com.example.festivalswebservice.model.Festival;
import com.example.festivalswebservice.model.FestivalRun;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FestivalRepository  extends JpaRepository<Festival, Integer> {
    public Festival findByFestivalId(int x);
    public List<Festival> findByCityContains(String s);
}
