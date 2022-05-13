package com.example.festivalswebservice.service;

import com.example.festivalswebservice.model.Shows;
import com.example.festivalswebservice.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
