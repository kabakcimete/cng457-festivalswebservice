package com.example.festivalswebservice.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Festival class has OneToMany relation with festivalrun
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "festivalid")
public class Festival {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int festivalid;
    private String festivalname;
    private String city;
    @OneToMany(mappedBy = "festival" , cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<FestivalRun> festivalruns;
}
