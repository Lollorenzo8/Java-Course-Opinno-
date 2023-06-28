package com.CorsoOpinnoJava.gestioneprenotazionispring.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String codice;
    private String descrizione;
    private Integer numero_max_occupanti;
    private TipoPrenotazione tipoPrenotazione;

    @ManyToOne
    private Edificio edificio;

    public Postazione(String codice, String descrizione, Integer numero_max_occupanti, TipoPrenotazione tipoPrenotazione, Edificio edificio) {
        this(null, codice, descrizione, numero_max_occupanti, tipoPrenotazione, edificio);
    }
}
