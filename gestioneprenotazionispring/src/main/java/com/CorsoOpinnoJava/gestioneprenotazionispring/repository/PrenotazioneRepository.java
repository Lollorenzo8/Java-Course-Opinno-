package com.CorsoOpinnoJava.gestioneprenotazionispring.repository;

import com.CorsoOpinnoJava.gestioneprenotazionispring.model.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
}
