package com.example.festivalswebservice.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;


/**
 * Organizer class has ManyToMany relation with festivalruns
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "Email")
public class Organizer {


    @Id
    @Column(name="email")
    private String email;
    private String fName;
    private String lName;
    private String address;
    private int phone;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "festivalOrganizer", joinColumns = @JoinColumn (name = "frid"), inverseJoinColumns = @JoinColumn (name = "email"))
    private Set<FestivalRun> festivals;
}
