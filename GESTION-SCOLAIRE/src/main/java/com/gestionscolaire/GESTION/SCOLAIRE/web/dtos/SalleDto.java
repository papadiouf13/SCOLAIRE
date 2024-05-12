package com.gestionscolaire.GESTION.SCOLAIRE.web.dtos;

import java.io.Serializable;

import lombok.Value;

@Value
public class SalleDto implements Serializable{
    Long id;
    String libelle;
    int nombrePlace;
}
