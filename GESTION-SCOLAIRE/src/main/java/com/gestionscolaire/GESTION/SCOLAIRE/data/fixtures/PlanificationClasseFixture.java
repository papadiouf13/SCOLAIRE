package com.gestionscolaire.GESTION.SCOLAIRE.data.fixtures;

import com.gestionscolaire.GESTION.SCOLAIRE.data.entity.Classe;
import com.gestionscolaire.GESTION.SCOLAIRE.data.entity.Planification;
import com.gestionscolaire.GESTION.SCOLAIRE.data.entity.PlanificationClasse;
import com.gestionscolaire.GESTION.SCOLAIRE.data.repository.ClasseRepository;
import com.gestionscolaire.GESTION.SCOLAIRE.data.repository.PlanificationClasseRepository;
import com.gestionscolaire.GESTION.SCOLAIRE.data.repository.PlanificationRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Order(3) // Ordre d'exécution de la fixture
public class PlanificationClasseFixture implements CommandLineRunner  {
    private final PlanificationClasseRepository planificationClasseRepository;
    private final PlanificationRepository planificationRepository;
    private final ClasseRepository classeRepository;

    @Override
    public void run(String... args) throws Exception {
        for (int i = 1; i < 10; i++) {
            Planification planification = planificationRepository.findById(Long.valueOf(i)).get();
            Classe classe = classeRepository.findById(Long.valueOf(i)).get();

            PlanificationClasse planificationClasse = PlanificationClasse.builder()
                .planification(planification)
                .classe(classe)
                // Autres champs si nécessaire
                .build();
                
            planificationClasseRepository.save(planificationClasse);
        }
    }
}
