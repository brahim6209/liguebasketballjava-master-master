package com.liguebasket.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter

public class Rencontre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idRencontre;

    @Column
    private Date dateDuMatch;

    @Column
    private String lieuDuMatch;

    @Column
    private  Long idEquipe1;

    @Column
    private Long idEquipe2;

    @ManyToOne
    private     Journee journee;

    @ManyToOne
    private  Ligue ligue;




}

