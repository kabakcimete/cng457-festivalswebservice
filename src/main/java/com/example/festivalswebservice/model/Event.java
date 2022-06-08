package com.example.festivalswebservice.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * Event entity is a superclass for Concert, Show, and OtherActivity
 * Has ManytoOne relationship with festivalrun
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "eventid")
public  class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int eventid;
    private String name;
    private int duration;
    private String description;
    private Date date;
    @ManyToOne
    private FestivalRun festivalrun;

}
