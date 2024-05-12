package com.gestionscolaire.GESTION.SCOLAIRE.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Professeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 25)
    private String prenom;
    @Column(length = 25)
    private String nom;
    @Column(length = 25)
    private String email;
    @Column(length = 25)
    private String password;
    @Column(length = 25)
    private String grade;
    private String photo;
    @OneToMany(mappedBy = "professeur")
    private List<Planification> planifications;

 
}
