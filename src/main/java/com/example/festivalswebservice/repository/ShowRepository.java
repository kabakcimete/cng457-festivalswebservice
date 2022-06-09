package com.example.festivalswebservice.repository;

import com.example.festivalswebservice.model.Shows;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowRepository  extends JpaRepository<Shows, Integer> {

    /**
     *
     * @param lower a duration time
     * @param upper a duration time
     * @return a list of shows whose duration is between given two durations
     */
    public List<Shows> findByDurationIsBetween(int lower, int upper);


}
