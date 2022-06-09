package com.example.festivalswebservice.service;

import com.example.festivalswebservice.model.Shows;
import com.example.festivalswebservice.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;

import java.util.List;

@Service
public class ShowService {
    @Autowired
    ShowRepository showRepository;

    /**
     * This method is for adding the given Show
     * @param s Show object
     * @return Show
     */
    public Shows saveShow(Shows s){
        return showRepository.save(s);
    }

    /**
     * This method is for geting the list of shows with the maximumum number of performers
     * @return a list of shows with the maximum number of performers
     */

    public List<Shows> maxPerformers(){
        int maximumPerformers = -1;
        ArrayList<Shows> results = new ArrayList<>();
        List<Shows> showss = showRepository.findAll();
        for(Shows  availableshow: showss){
            int performerNo =availableshow.getPerformers().size();
            if(maximumPerformers < performerNo){
                maximumPerformers = performerNo;
                if(!results.isEmpty()) {
                    results.clear();
                }
                results.add(availableshow);
                continue;
            }
            if(maximumPerformers == performerNo){
                results.add(availableshow);
            }

        }


        return results;
    }

    /**
     * This method is for finding the shows which have a duration time between the given interval
     * @param lower duration time
     * @param upper duration time
     * @return a list of shows which have a duration between the given lower and upper times
     */
    public List<Shows> findByDurationIsBetween(int lower, int upper){
        return showRepository.findByDurationIsBetween(lower, upper);
    }

}
