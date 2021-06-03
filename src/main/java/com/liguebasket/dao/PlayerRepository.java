package com.liguebasket.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.liguebasket.entities.Arbitre;
import com.liguebasket.entities.Player;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface PlayerRepository extends JpaRepository<Player, Long>{

}
