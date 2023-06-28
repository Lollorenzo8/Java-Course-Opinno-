package com.CorsoOpinnoJava.gestioneprenotazionispring.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private String indirizzo;

    @ManyToOne
    private Citta citta;

    public Edificio(String nome, String indirizzo, Citta citta) {
        this(null, nome, indirizzo, citta);
    }
}
