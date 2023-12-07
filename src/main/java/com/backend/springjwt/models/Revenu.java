package com.backend.springjwt.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Revenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double montant;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime dateAjout;


    public Revenu() {
    }

    public Revenu(Long id, Double montant, LocalDateTime dateAjout) {
        this.id = id;
        this.montant = montant;
        this.dateAjout = dateAjout;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public LocalDateTime getDateAjout() {
        return dateAjout;
    }

    public void setDateAjout(LocalDateTime dateAjout) {
        this.dateAjout = dateAjout;
    }
}
