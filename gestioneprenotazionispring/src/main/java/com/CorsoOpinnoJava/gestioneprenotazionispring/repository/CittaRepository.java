package com.CorsoOpinnoJava.gestioneprenotazionispring.repository;

import com.CorsoOpinnoJava.gestioneprenotazionispring.model.Citta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CittaRepository extends JpaRepository<Citta, Long> {
}
