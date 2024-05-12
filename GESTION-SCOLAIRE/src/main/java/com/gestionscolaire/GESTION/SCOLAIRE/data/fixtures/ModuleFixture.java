package com.gestionscolaire.GESTION.SCOLAIRE.data.fixtures;

import com.gestionscolaire.GESTION.SCOLAIRE.data.entity.Modules;
import com.gestionscolaire.GESTION.SCOLAIRE.data.repository.ModulesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Order(1)
public class ModuleFixture implements CommandLineRunner  {
    private final ModulesRepository modulesRepository;

    @Override
    public void run(String... args) throws Exception {
        for (int i = 1; i < 10; i++) {
            Modules modules = Modules.builder()
            .libelle("Module"+i)
            .build();
             modulesRepository.save(modules);
        }
    }

     
}
