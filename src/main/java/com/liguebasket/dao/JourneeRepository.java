package com.liguebasket.dao;

import com.liguebasket.entities.Journee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface JourneeRepository extends JpaRepository<Journee, Long>{


}
