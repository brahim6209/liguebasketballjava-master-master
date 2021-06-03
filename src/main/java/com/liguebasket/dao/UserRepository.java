package com.liguebasket.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.liguebasket.entities.AppUser;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface UserRepository extends JpaRepository<AppUser, Long> {
	public AppUser findByUsername(String username);

}
