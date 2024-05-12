package com.gestionscolaire.GESTION.SCOLAIRE.data.fixtures;

import com.gestionscolaire.GESTION.SCOLAIRE.data.entity.Modules;
import com.gestionscolaire.GESTION.SCOLAIRE.data.entity.Planification;
import com.gestionscolaire.GESTION.SCOLAIRE.data.entity.Professeur;
import com.gestionscolaire.GESTION.SCOLAIRE.data.entity.Semestre;
import com.gestionscolaire.GESTION.SCOLAIRE.data.repository.ModulesRepository;
import com.gestionscolaire.GESTION.SCOLAIRE.data.repository.PlanificationRepository;
import com.gestionscolaire.GESTION.SCOLAIRE.data.repository.ProfesseurRepository;
import com.gestionscolaire.GESTION.SCOLAIRE.data.repository.SemestreRepository;

import lombok.RequiredArgsConstructor;


import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Order(2)
public class PlanificationFixture implements CommandLineRunner  {
    private final PlanificationRepository planificationRepository;
    private final SemestreRepository semestreRepository;
    private final ProfesseurRepository professeurRepository;
    private final ModulesRepository moduleRepository;

    @Override
    public void run(String... args) throws Exception {
        for (int i = 1; i < 10; i++) {
            Semestre semestre =  semestreRepository.findById(Long.valueOf(i)).get();
            Modules modules = moduleRepository.findById(Long.valueOf(i)).get();
            Professeur professeur = professeurRepository.findById(Long.valueOf(i)).get();

            professeurRepository.findById(Long.valueOf(i));
            Planification planification = Planification.builder()
            .nombreHeure(10+i)
            .nombreHeureEffectuee(i)
            .nombreHeureRestant(i)
            .semestre(semestre)
            .modules(modules)
            .professeur(professeur)
            .build();
            planificationRepository.save(planification);
        }
    }

     
}
