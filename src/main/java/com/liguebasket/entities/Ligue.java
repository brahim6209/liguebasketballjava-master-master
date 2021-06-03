package com.liguebasket.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
@Data
@AllArgsConstructor @NoArgsConstructor @ToString
public class Ligue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idLigue;

    @Column
    private String nomLigue;

   @OneToMany(mappedBy = "ligue")
    private Collection<Journee> journee;

@OneToMany(mappedBy = "ligue")
    private Collection<Rencontre> rencontre;


}
