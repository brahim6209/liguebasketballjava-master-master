package controller;

import com.liguebasket.dao.PlayerRepository;
import com.liguebasket.entities.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PlayerController {
    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping("/players/{id}")
    public ResponseEntity<Player> getPlayerById(@PathVariable Long id, @RequestBody Player playerDetails ){

        Player player = playerRepository.findById(id).orElseThrow (()->new ResourceNotFoundException("jouer introuvable avec ce id: "+id));

        player.setIdJoueur(playerDetails.getIdJoueur());
        player.setMatricule(playerDetails.getMatricule());
        player.setNom(playerDetails.getNom());
        player.setPrenom(playerDetails.getPrenom());
        player.setDateNaissance(playerDetails.getDateNaissance());
        player.setNationnalite(playerDetails.getNationnalite());
        player.setNumeroLicence(playerDetails.getNumeroLicence());

        Player updatePlayer = playerRepository.save(player);
        return ResponseEntity.ok(updatePlayer);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Player> updatePlayer(@PathVariable Long id,@RequestBody Player playerDetails){
        Player player = playerRepository.findById(id).orElseThrow (()->new ResourceNotFoundException("jouer introuvable avec id: "+id));

        player.setIdJoueur(playerDetails.getIdJoueur());
        player.setMatricule(playerDetails.getMatricule());
        player.setNom(playerDetails.getNom());
        player.setPrenom(playerDetails.getPrenom());
        player.setDateNaissance(playerDetails.getDateNaissance());
        player.setNationnalite(playerDetails.getNationnalite());
        player.setNumeroLicence(playerDetails.getNumeroLicence());

        Player updatePlayer = playerRepository.save(player);
        return ResponseEntity.ok(updatePlayer);

    }
}
