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
public class Planification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private int nombreHeure;
    @Column(length = 50)
    private int nombreHeureEffectuee;
    @Column(length = 50)
    private int nombreHeureRestant;
    @ManyToOne
    @JoinColumn(name = "semestre_id")
    private Semestre semestre;
    @ManyToOne
    @JoinColumn(name = "professeur_id")
    private Professeur professeur;
    @ManyToOne
    @JoinColumn(name = "module_id")
    private Modules modules;
    @OneToMany(mappedBy = "planification")
    private List<PlanificationClasse> planificationClasses;
    @OneToMany(mappedBy = "planification")
    private List<Seance> seances;

}
