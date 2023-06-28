package com.CorsoOpinnoJava.gestioneprenotazionispring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    private String nome;
    private String email;
    private String password;

    public Utente(String username, String nome, String email, String password) {
        this(null, username, nome, email, password);
    }
}
