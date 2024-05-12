package com.gestionscolaire.GESTION.SCOLAIRE.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.gestionscolaire.GESTION.SCOLAIRE.data.entity.Professeur;
@RepositoryRestController
public interface ProfesseurRepository extends JpaRepository<Professeur, Long> {
}
