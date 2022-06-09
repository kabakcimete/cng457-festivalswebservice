package com.example.festivalswebservice.repository;

import com.example.festivalswebservice.model.Festival;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FestivalRepository  extends JpaRepository<Festival, Integer> {
    /**
     * @param x is the wanted id of Festival with the type integer
     * @return Festival with the id number of input variable x
     * */
    public Festival findByFestivalid(int x);
    /**
     * @param s is the name of the city in String format
     * @return List of Festival with the given city name of variable s
     * */
    public List<Festival> findByCityContains(String s);

    /**
     *
     * @param name is the keyword to be searched for the names of festival
     * @return a list of festival whose name includes a given keyword
     */
    @Query("SELECT f FROM Festival f WHERE f.festivalname IN: name")
    public List<Festival> getFestivalbyName(@Param("name") String name);

    /**
     *
     * @return a list of festival with the highest number of runs
     */

    @Query("SELECT f FROM Festival f WHERE f.festivalruns.size = (SELECT max(festivalruns.size) FROM Festival )")
    public List<Festival> popularFestivals();
}
