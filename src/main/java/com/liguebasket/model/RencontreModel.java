package com.liguebasket.model;

import com.liguebasket.entities.Journee;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.util.Date;


@Data
public class RencontreModel {
    private Date dateDuMatch;

    private String lieuDuMatch;


    private  Long idEquipe1;


    private Long idEquipe2;


    private Long idJournee;
     private Long idLigue;

}
