package com.gestionscolaire.GESTION.SCOLAIRE.data.entity;

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
@Table(name = "planification_classe")
public class PlanificationClasse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "planification_id")
    private Planification planification;

    @ManyToOne
    @JoinColumn(name = "classe_id")
    private Classe classe;
}
