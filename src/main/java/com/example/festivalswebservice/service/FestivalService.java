package com.example.festivalswebservice.service;


import com.example.festivalswebservice.model.Festival;
import com.example.festivalswebservice.model.FestivalRun;
import com.example.festivalswebservice.repository.FestivalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FestivalService {
    @Autowired
    FestivalRepository festivalRepository;


    /**
     * This method returns the wanted festival by id.
     * @param id integer value for the wanted festival
     * @return Festival
     */
    public Festival getFestival(int id){
        return festivalRepository.findByFestivalid(id);

    }

    /**
     * This method returns list of all the Festival
     * @return List of Festival
     */
    public List<Festival> getAllFestival(){
        return festivalRepository.findAll();

    }

    /**
     * This method is for adding the given Festival
     * @param f Festival object
     * @return Festival
     */
    public Festival saveFestival(Festival f){
        return festivalRepository.save(f);
    }

    /**
     * This method returns the set of FestivalRun for the given Festival id.
     * @param id for the Festival
     * @return Set of FestivalRun
     */
    public List<FestivalRun> getAllFestivalRuns(int id){
        return festivalRepository.findByFestivalid(id).getFestivalruns();
    }

    /**
     * This method returns the list of Festival for the given city name in String format
     * @param c the city name in String format
     * @return List of Festival
     */
    public List<Festival> getFestivalsForACity(String c){
        return festivalRepository.findByCityContains(c);
    }

    /**
     *
     * @param name is the keyword to be searched in the festivals name
     * @return a list of festivals whose name includes the given keyword "name"
     */
    public List<Festival> festivalsByName(String name){return festivalRepository.getFestivalbyName(name);}

    /**
     *
     * @return a list of festivals with the highest number of runs
     */
    public List<Festival> popularFestivals(){return festivalRepository.popularFestivals();}
}
