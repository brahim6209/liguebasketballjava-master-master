package com.liguebasket.model;

import lombok.Data;

import java.util.Date;
import com.liguebasket.entities.Equipe;
import com.liguebasket.entities.Journee;
import com.liguebasket.entities.Ligue;

@Data
public class RencontreResult {

    private Date dateDuMatch;

    private String lieuDuMatch;


    private  Equipe idEquipe1;


    private Equipe idEquipe2;


    private Journee idJournee;

    private  Ligue idLigue;
}


