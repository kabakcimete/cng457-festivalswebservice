package com.example.festivalswebservice.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "Email")
public class Organizer {


    @Id
    @Column(name="email")
    private String Email;
    private String FName;
    private String LName;
    private String Address;
    private int Phone;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "FestivalOrganizer", joinColumns = @JoinColumn (name = "frid"), inverseJoinColumns = @JoinColumn (name = "email"))
    private Set<FestivalRun> festivals;
}
