package com.omega.omegabackend.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "scores")
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private int valeur;

    private LocalDateTime date = LocalDateTime.now();

    // 🔹 Constructeur vide OBLIGATOIRE pour JPA
    public Score() {
    }

    // 🔹 Constructeur pratique (optionnel)
    public Score(String nom, int valeur) {
        this.nom = nom;
        this.valeur = valeur;
    }

    // 🔹 GETTERS & SETTERS (OBLIGATOIRES)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
