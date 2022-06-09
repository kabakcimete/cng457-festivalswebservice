package com.example.festivalswebservice.service;

import com.example.festivalswebservice.model.Event;
import com.example.festivalswebservice.model.Performer;
import com.example.festivalswebservice.model.Shows;
import com.example.festivalswebservice.repository.ShowRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ShowServiceTest extends Event {

    @InjectMocks
    ShowService showService;
    @Mock
    ShowRepository showRepository;


    @Test
    void maxPerformers() {

        ArrayList<Shows> Showss = new ArrayList<>();
        Shows show1 = new Shows();
        show1.setName("Halk Oyunlari");
        Shows show2 = new Shows();
        show2.setName("Tombala");

        Performer performer1 = new Performer();
        performer1.setName("Ozlem Sultan");

        Performer performer2 = new Performer();
        performer2.setName("Sari Tutku");

        Performer performer3 = new Performer();
        performer3.setName("Aleyna Tilki");
        Set<Performer> performersSet = new HashSet<Performer>();
        performersSet.add(performer1);
        performersSet.add(performer2);
        show1.setPerformers(performersSet);

        Set<Performer> performerSet2 = new HashSet<Performer>();
        performerSet2.add(performer1);
        performerSet2.add(performer2);
        performerSet2.add(performer3);
        show2.setPerformers(performerSet2);

        Showss.add(show1);
        Showss.add(show2);

        when(showRepository.findAll()).thenReturn(Showss);
        List<Shows> showList = showService.maxPerformers();
        assertEquals(1, showList.size());
        assertEquals(3, showList.get(0).getPerformers().size());

    }
}