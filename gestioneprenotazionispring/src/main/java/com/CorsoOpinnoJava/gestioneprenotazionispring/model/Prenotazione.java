package com.CorsoOpinnoJava.gestioneprenotazionispring.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Data
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date data_prenotazione;
    private Date data_uso_postazione;

    @ManyToOne
    private Utente utente;

    @ManyToOne
    private Postazione postazione;

    public Prenotazione(Date data_prenotazione, Date data_uso_postazione, Utente utente, Postazione postazione) {
        this(null, data_prenotazione, data_uso_postazione, utente, postazione);
    }
}
