package com.gestionscolaire.GESTION.SCOLAIRE.data.repository;

import com.gestionscolaire.GESTION.SCOLAIRE.data.entity.Modules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
@RepositoryRestController
public interface ModulesRepository extends JpaRepository<Modules, Long> {
}
