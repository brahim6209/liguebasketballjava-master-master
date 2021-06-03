package controller;

import com.liguebasket.dao.JourneeRepository;
import com.liguebasket.dao.RencontreRepository;
import com.liguebasket.dao.EquipeRepository;
import com.liguebasket.entities.Journee;
import com.liguebasket.entities.Rencontre;
import com.liguebasket.model.RencontreModel;
import com.liguebasket.model.RencontreResult;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")

@Transactional
public class RencontreController {

@Autowired
private JourneeRepository journeeRepository;

@Autowired
private  RencontreRepository rencontreRepository;

@Autowired
private EquipeRepository equipeRepository;

    @GetMapping("rencontre/all")
    public List<RencontreResult> getRencontre(){

        List<RencontreResult> allRencontre= new ArrayList<RencontreResult>();
        for (Rencontre rencontre : rencontreRepository.findAll()) {
            RencontreResult rencontreResult = new RencontreResult();
            rencontreResult.setDateDuMatch(rencontre.getDateDuMatch());
            rencontreResult.setIdEquipe1(equipeRepository.getOne(rencontre.getIdEquipe1()));

            allRencontre.add(rencontreResult);
        }
        return allRencontre;
    }





@PostMapping("/setRencontre")
    public void  addRencontre(@RequestBody RencontreModel model){

    System.out.println(model);
        Rencontre rencontre = new Rencontre();
    Journee journee = journeeRepository.getOne(model.getIdJournee());

        rencontre.setDateDuMatch(model.getDateDuMatch());
        rencontre.setIdEquipe1(model.getIdEquipe1());
        rencontre.setIdEquipe2(model.getIdEquipe2());
        rencontre.setJournee(journee);

        rencontreRepository.save(rencontre);

    }



    }
