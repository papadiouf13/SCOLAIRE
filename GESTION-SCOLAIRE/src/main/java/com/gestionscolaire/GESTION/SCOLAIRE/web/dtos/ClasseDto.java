package com.gestionscolaire.GESTION.SCOLAIRE.web.dtos;

import java.io.Serializable;

import lombok.Value;
@Value
public class ClasseDto implements Serializable {
    Long id;
    String libelle;
}
