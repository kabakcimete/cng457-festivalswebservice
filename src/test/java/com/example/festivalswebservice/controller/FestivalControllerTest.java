package com.example.festivalswebservice.controller;

import com.example.festivalswebservice.FestivalswebserviceApplication;
import com.example.festivalswebservice.model.Festival;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = FestivalswebserviceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class FestivalControllerTest {

    @Autowired
    TestRestTemplate restTemplate;

    @LocalServerPort
    int port;

    @Test
    void popularFestivals() {

        assertEquals(this.restTemplate.getForObject("http://localhost:" + port + "/popularfestivals", Festival[].class).length, 1);
    }
}