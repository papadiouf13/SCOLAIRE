package com.gestionscolaire.GESTION.SCOLAIRE.web.dtos;

import java.io.Serializable;

import lombok.Value;

@Value
public class PlanificationDto implements Serializable {
    Long id;
    int nombreHeure;
    int nombreHeureEffectuee;
    int nombreHeureRestant;
    Long semestreId;
    Long professeurId;
    Long moduleId;
}
