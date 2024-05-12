package com.gestionscolaire.GESTION.SCOLAIRE.web.dtos;

import java.io.Serializable;

import com.gestionscolaire.GESTION.SCOLAIRE.data.enums.StatutSeance;
import com.gestionscolaire.GESTION.SCOLAIRE.data.enums.TypeCours;

import lombok.Value;

@Value
public class SeanceDto implements Serializable{
    int id;
    String heureDebut;
    String heureFin;
    TypeCours typeCours;
    StatutSeance statutSeance;
    Long planificationId;
    Long salleId;
}
