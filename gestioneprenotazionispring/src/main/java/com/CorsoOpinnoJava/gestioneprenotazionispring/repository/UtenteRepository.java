package com.CorsoOpinnoJava.gestioneprenotazionispring.repository;

import com.CorsoOpinnoJava.gestioneprenotazionispring.model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteRepository extends JpaRepository<Utente, Long> {
}
