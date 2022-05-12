package com.example.festivalswebservice.repository;

import com.example.festivalswebservice.model.Festival;
import com.example.festivalswebservice.model.FestivalRun;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FestivalRunRepository  extends JpaRepository<FestivalRun, Integer> {
    public FestivalRun findByFestivalRunId(int x);
    public List<FestivalRun> findByDurationLessThan(int i);

}
