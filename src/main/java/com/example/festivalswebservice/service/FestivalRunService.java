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

    /**
     * This method is for getting the festivalRun
     * @param id the integer valued id number for the wanted FestivalRun
     * @return FestivalRun is returned
     */
    public FestivalRun getFestivalRun(int id){
        return festivalRunRepository.findByFestivalRunId(id);
    }

    /**
     * This method is for adding FestivalRun
     * @param f FestivalRun object
     * @return FestivalRun is returned
     */
    public FestivalRun saveFestivalRun(FestivalRun f){
        return festivalRunRepository.save(f);
    }

    /**
     * This method is for getting all the FestivalRuns which are less then the entered time of integer x.
     * @param x the integer duration time that the less than of is wanted
     * @return List of FestivalRun
     */
    public List<FestivalRun> getShortFestivalRun(int x){
        return festivalRunRepository.findByDurationLessThan(x);
    }


}
