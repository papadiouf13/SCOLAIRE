package com.gestionscolaire.GESTION.SCOLAIRE.data.repository;
import com.gestionscolaire.GESTION.SCOLAIRE.data.entity.Planification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
@RepositoryRestController
public interface PlanificationRepository extends JpaRepository<Planification , Long>  {
    
}
