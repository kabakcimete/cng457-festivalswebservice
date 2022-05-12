package com.example.festivalswebservice.service;
import com.example.festivalswebservice.model.Concert;
import com.example.festivalswebservice.model.FestivalRun;
import com.example.festivalswebservice.repository.FestivalRunRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FestivalRunService {
    @Autowired
    FestivalRunRepository festivalRunRepository;

    public FestivalRun getFestivalRun(int id){
        return festivalRunRepository.findByFestivalRunId(id);
    }

    public FestivalRun saveFestivalRun(FestivalRun f){
        return festivalRunRepository.save(f);
    }

    public List<FestivalRun> getShortFestivalRun(int x){
        return festivalRunRepository.findByDurationLessThan(x);
    }


}
