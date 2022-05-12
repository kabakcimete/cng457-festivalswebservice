package com.example.festivalswebservice.service;
;

import com.example.festivalswebservice.model.Festival;
import com.example.festivalswebservice.model.FestivalRun;
import com.example.festivalswebservice.repository.FestivalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class FestivalService {
    @Autowired
    FestivalRepository festivalRepository;

    public Festival getFestival(int id){
        return festivalRepository.findByFestivalId(id);

    }

    public List<Festival> getAllFestival(){
        return festivalRepository.findAll();

    }

    public Festival saveFestival(Festival f){
        return festivalRepository.save(f);
    }

    public Set<FestivalRun> getAllFestivalRuns(int id){
        return festivalRepository.findByFestivalId(id).getFestivalRuns();
    }
    public List<Festival> getFestivalsForACity(String c){
        return festivalRepository.findByCityContains(c);
    }
}
