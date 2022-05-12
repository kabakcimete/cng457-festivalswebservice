package com.example.festivalswebservice.service;

import com.example.festivalswebservice.model.FestivalRun;
import com.example.festivalswebservice.model.Show;
import com.example.festivalswebservice.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowService {
    @Autowired
    ShowRepository showRepository;

    public Show saveShow(Show s){
        return showRepository.save(s);
    }
}
