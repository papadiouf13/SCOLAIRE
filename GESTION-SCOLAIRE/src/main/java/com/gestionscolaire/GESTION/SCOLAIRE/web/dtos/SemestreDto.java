package com.gestionscolaire.GESTION.SCOLAIRE.web.dtos;

import java.io.Serializable;

import lombok.Value;

@Value
public class SemestreDto implements Serializable {
    Long id;
    String libelle;
}
