package com.example.festivalswebservice.service;

import com.example.festivalswebservice.model.Concert;
import com.example.festivalswebservice.model.Event;
import com.example.festivalswebservice.repository.ConcertRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class ConcertServiceTest extends Event {

    @InjectMocks
    ConcertService concertService;
    @Mock
    ConcertRepository concertRepository;



    @Test

    void longestConcert() {

        ArrayList<Concert> concerts = new ArrayList<>();
        Concert concert1 = new Concert();
        concert1.setName("Tarkan Concert");
        concert1.setDuration(3);
        concert1.setDescription("Acik Hava Consert");

        Concert concert2 = new Concert();
        concert2.setName("Ajdar Concert");
        concert2.setDuration(2);
        concert2.setDescription("Acik Hava Consert");

        Concert concert3 = new Concert();
        concert3.setName("Murat Boz Concert");
        concert3.setDuration(3);
        concert3.setDescription("Acik Hava Consert");

        concerts.add(concert1);
        concerts.add(concert2);
        concerts.add(concert3);

        when(concertRepository.findAll()).thenReturn(concerts);
        List<Concert> concertsList = concertService.longestConcert();
        assertEquals(2, concertsList.size());
        assertEquals(3, concertsList.get(0).getDuration());

    }
}