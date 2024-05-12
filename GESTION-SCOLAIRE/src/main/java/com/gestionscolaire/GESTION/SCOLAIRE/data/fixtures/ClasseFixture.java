package com.gestionscolaire.GESTION.SCOLAIRE.data.fixtures;

import com.gestionscolaire.GESTION.SCOLAIRE.data.entity.Classe;
import com.gestionscolaire.GESTION.SCOLAIRE.data.repository.ClasseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order(1)
@Component
@RequiredArgsConstructor
public class ClasseFixture implements CommandLineRunner  {
    private final ClasseRepository classeRepository;

    @Override
    public void run(String... args) throws Exception {
        for (int i = 1; i < 10; i++) {
            Classe classe = Classe.builder()
            .libelle("Classe"+i)
            .build();
             classeRepository.save(classe);
        }
    }

     
}
