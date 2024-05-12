package com.gestionscolaire.GESTION.SCOLAIRE.data.fixtures;

import com.gestionscolaire.GESTION.SCOLAIRE.data.entity.Semestre;
import com.gestionscolaire.GESTION.SCOLAIRE.data.repository.SemestreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order(1)
@Component
@RequiredArgsConstructor
public class SemestreFixture implements CommandLineRunner  {
    private final SemestreRepository semestreRepository;

    @Override
    public void run(String... args) throws Exception {
        for (int i = 1; i < 10; i++) {
            Semestre semestre = Semestre.builder()
            .libelle("Semestre"+i)
            .build();
            semestreRepository.save(semestre);
        }
    }

     
}
