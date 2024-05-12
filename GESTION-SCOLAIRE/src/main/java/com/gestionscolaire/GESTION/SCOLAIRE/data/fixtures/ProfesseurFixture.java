package com.gestionscolaire.GESTION.SCOLAIRE.data.fixtures;

import com.gestionscolaire.GESTION.SCOLAIRE.data.entity.Professeur;
import com.gestionscolaire.GESTION.SCOLAIRE.data.repository.ProfesseurRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order(1)
@Component
@RequiredArgsConstructor
public class ProfesseurFixture implements CommandLineRunner  {
    private final ProfesseurRepository professeurRepository;

    @Override
    public void run(String... args) throws Exception {
        for (int i = 1; i < 10; i++) {
            Professeur professeur = Professeur.builder()
            .nom("nom"+i)
            .prenom("prenom"+i)
            .email("email@mail.com")
            .photo("https://img.freepik.com/vecteurs-premium/photo-profil-avatar-homme-illustration-vectorielle_268834-538.jpg?w=1380")
            .password("password")
            .grade("grade")
            .build();
             professeurRepository.save(professeur);
        }
    }

     
}
