package controller;

import com.liguebasket.dao.JourneeRepository;

import com.liguebasket.entities.Journee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BasketMatchController {
    @Autowired
    private JourneeRepository journeeRepository;

    @GetMapping("/Journees/{id}")
    public ResponseEntity<Journee> getPlayerById(@PathVariable Long id, @RequestBody Journee matchDetails ){

        Journee journee = journeeRepository.findById(id).orElseThrow (()->new ResourceNotFoundException("match introuvable avec ce id: "+id));

        journee.setIdJournee(matchDetails.getIdJournee());

        journee.setResultatEquipe1(matchDetails.getResultatEquipe1());
        journee.setResultatEquipe1(matchDetails.getResultatEquipe1());



        Journee updateMatch = journeeRepository.save(journee);
        return ResponseEntity.ok(updateMatch);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Journee> updatePlayer(@PathVariable Long id,@RequestBody Journee matchDetails){
        Journee journee = journeeRepository.findById(id).orElseThrow (()->new ResourceNotFoundException("match introuvable avec id: "+id));

        journee.setIdJournee(matchDetails.getIdJournee());
        
        journee.setResultatEquipe1(matchDetails.getResultatEquipe1());
        journee.setResultatEquipe1(matchDetails.getResultatEquipe1());



       Journee updateJournee = journeeRepository.save(journee);
        return ResponseEntity.ok(updateJournee);


    }
}
