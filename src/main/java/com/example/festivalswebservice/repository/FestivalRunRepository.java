package com.example.festivalswebservice.repository;

import com.example.festivalswebservice.model.Festival;
import com.example.festivalswebservice.model.FestivalRun;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FestivalRunRepository  extends JpaRepository<FestivalRun, Integer> {
    /**
     * @return FestivalRun which have the given id number of input variable x
     * */
    public FestivalRun findByFestivalRunId(int x);
    /**
     * @return list of FestivalRuns with the duration number less than the input variable i
     * */
    public List<FestivalRun> findByDurationLessThan(int i);

}
