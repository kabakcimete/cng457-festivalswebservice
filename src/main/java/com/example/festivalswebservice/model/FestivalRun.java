package com.example.festivalswebservice.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "FestivalRunId")
public class FestivalRun {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="frid")
    private int FestivalRunId;
    private String Name;
    private int Duration;
    private Date Date;
    @OneToMany(mappedBy = "Festivalrun" , cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Event> Events;
    @ManyToMany(mappedBy = "festivals" , fetch = FetchType.EAGER)

    private Set<Organizer> Organizers;
    @ManyToOne
    private Festival festival;
}
