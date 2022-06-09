package com.example.festivalswebservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Class of Performer, have a ManyToOne relationship to Shows
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Performer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int performerid;
    private String name;
    private String surname;
    @ManyToOne
    private Shows showw;
}
