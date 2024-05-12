package com.gestionscolaire.GESTION.SCOLAIRE.data.fixtures;

import com.gestionscolaire.GESTION.SCOLAIRE.data.entity.Salle;
import com.gestionscolaire.GESTION.SCOLAIRE.data.repository.SalleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order(1)
@Component
@RequiredArgsConstructor
public class SalleFixture implements CommandLineRunner  {
    private final SalleRepository salleRepository;

    @Override
    public void run(String... args) throws Exception {
        for (int i = 1; i < 10; i++) {
            Salle salle = Salle.builder()
            .libelle("Salle"+i)
            .nombrePlace(10+i)
            .build();
             salleRepository.save(salle);
        }
    }

     
}
