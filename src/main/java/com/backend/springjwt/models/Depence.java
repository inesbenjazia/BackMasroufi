package com.backend.springjwt.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Depence {
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double montant;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime dateAjout;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryDepence CategoryDepence ;


    //constructor
    public Depence(Long id, Double montant,CategoryDepence categoryDepence) {
        this.id = id;
        this.montant = montant;
        this.dateAjout = LocalDateTime.now();
        this.CategoryDepence= categoryDepence;
    }

    //empty constructor
    public Depence() {

    }



    //getter and setter Id

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    //getter and setter montant

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }


    //getter and setter DateAjout

    public void setDateAjout() {
        this.dateAjout = LocalDateTime.now();
    }
    public LocalDateTime getDateAjout() {
        return dateAjout;
    }

    public CategoryDepence getCategoryDepence() {
        return CategoryDepence;
    }

    public void setCategoryDepence(CategoryDepence categoryDepence) {
        this.CategoryDepence = categoryDepence;
    }
}
