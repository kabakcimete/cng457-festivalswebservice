package com.example.festivalswebservice.repository;

import com.example.festivalswebservice.model.Festival;
import com.example.festivalswebservice.model.FestivalRun;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FestivalRepository  extends JpaRepository<Festival, Integer> {
    /**
     * @return Festival with the id number of input variable x
     * */
    public Festival findByFestivalId(int x);
    /**
     * @return List of Festival with the given city name of variable s
     * */
    public List<Festival> findByCityContains(String s);
}
