package com.liguebasket.entities;



import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;

import java.util.Collection;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor @ToString
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEquipe;

    @NotNull
    @Column(unique = true,length = 50 ,nullable = false)
    private String nom;

    /*@Column
    private int nombreDeJouers;

    @Column
    private int matchJouer;

     @Column
    private int matchPerdue;
    */



    @Column
    private int matchJouerDomicile;

    @Column
    private int matchJouerExterieur;

    @Column
    private int pointMarquer;

    @Column
    private int pointEncaisses;

    @Column
    private String logo;

    @Column
    @CreationTimestamp
    private Date dateDeCreation;

    @OneToMany(mappedBy = "equipe")
    private Collection<Player> player;



}
