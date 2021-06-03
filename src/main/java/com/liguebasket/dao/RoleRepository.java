package com.liguebasket.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.liguebasket.entities.AppRole;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin("*")
public interface RoleRepository extends JpaRepository<AppRole, Long> {
	public AppRole findByRole(String roleName);
}
