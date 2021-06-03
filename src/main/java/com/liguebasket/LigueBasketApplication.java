package com.liguebasket;

import com.liguebasket.entities.*;
import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import javax.management.relation.Role;

@SpringBootApplication
public class LigueBasketApplication implements CommandLineRunner {

	@Autowired
	RepositoryRestConfiguration repositoryRestConfiguration;


	public static void main(String[] args) {
		SpringApplication.run(LigueBasketApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Player.class);
		repositoryRestConfiguration.exposeIdsFor(Equipe.class);
		repositoryRestConfiguration.exposeIdsFor(Arbitre.class);
		repositoryRestConfiguration.exposeIdsFor(Journee.class);
		repositoryRestConfiguration.exposeIdsFor(Ligue.class);
		repositoryRestConfiguration.exposeIdsFor(AppUser.class);
		repositoryRestConfiguration.exposeIdsFor(Role.class);
		repositoryRestConfiguration.exposeIdsFor(Rencontre.class);


	}
}

