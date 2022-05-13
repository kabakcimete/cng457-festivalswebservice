package com.example.festivalswebservice.repository;

import com.example.festivalswebservice.model.Festival;
import com.example.festivalswebservice.model.FestivalRun;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FestivalRunRepository  extends JpaRepository<FestivalRun, Integer> {
    /**
     * @param x is the integer id of the FestivalRun
     * @return FestivalRun which have the given id number of input variable x
     * */
    public FestivalRun findByFestivalrunid(int x);
    /**
     * @param i is the duration time with the integer type.
     * @return list of FestivalRuns with the duration number less than the input variable i
     * */
    public List<FestivalRun> findByDurationLessThan(int i);

}
