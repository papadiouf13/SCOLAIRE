package com.gestionscolaire.GESTION.SCOLAIRE.data.entity;

import com.gestionscolaire.GESTION.SCOLAIRE.data.enums.StatutSeance;
import com.gestionscolaire.GESTION.SCOLAIRE.data.enums.TypeCours;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Seance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 50)
    private String heureDebut;
    @Column(length = 50)
    private String heureFin;
    @Column(length = 50)
    private TypeCours typeCours;
    @Column(length = 50)
    private StatutSeance statutSeance;
    @ManyToOne
    @JoinColumn(name = "planification_id")
    private Planification planification;
    @ManyToOne
    @JoinColumn(name = "salle_id")
    private Salle salle;
}