package com.example.festivalswebservice.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * festivalrun class has onetomany relation with Events,
 * ManyToMany relations with Organizer
 * and ManyToOne relation with Festival
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "FestivalRunId")
public class FestivalRun {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="frid")
    private int festivalRunId;
    private String name;
    private int duration;
    private Date date;
    @OneToMany(mappedBy = "festivalrun" , cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Event> events;
    @ManyToMany(mappedBy = "festivals" , fetch = FetchType.EAGER)

    private Set<Organizer> organizers;
    @ManyToOne
    private Festival festival;
}
