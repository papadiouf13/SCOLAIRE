package com.gestionscolaire.GESTION.SCOLAIRE.data.repository;

import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gestionscolaire.GESTION.SCOLAIRE.data.entity.Semestre;
@RepositoryRestController
public interface SemestreRepository extends JpaRepository<Semestre , Long> {
}
