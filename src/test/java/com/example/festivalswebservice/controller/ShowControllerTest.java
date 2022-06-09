package com.example.festivalswebservice.controller;

import com.example.festivalswebservice.FestivalswebserviceApplication;
import com.example.festivalswebservice.model.Festival;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = FestivalswebserviceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ShowControllerTest {

    @Autowired
    TestRestTemplate restTemplate;

    @LocalServerPort
    int port;


    @Test
    void maxPerformers() {

        assertEquals(this.restTemplate.getForObject("http://localhost:" + port + "/crowdedshows", Festival[].class).length, 1);

    }
}