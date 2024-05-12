package com.gestionscolaire.GESTION.SCOLAIRE.web.dtos;

import java.io.Serializable;
import lombok.Value;
@Value
public class ProfesseurDto implements Serializable{
    Long id;
    String prenom;
    String nom;
    String email;
    String password;
    String grade;
    String photo;
}
