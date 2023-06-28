package com.CorsoOpinnoJava.gestioneprenotazionispring.service;

import com.CorsoOpinnoJava.gestioneprenotazionispring.model.Citta;
import com.CorsoOpinnoJava.gestioneprenotazionispring.model.Utente;
import com.CorsoOpinnoJava.gestioneprenotazionispring.repository.CittaRepository;
import com.CorsoOpinnoJava.gestioneprenotazionispring.repository.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UtenteService {
    @Autowired
    UtenteRepository utenteRepository;

    public Utente saveUtente(Utente utente) {
        return utenteRepository.save(utente);
    }

    public Optional<Utente> getUtenteById(Long id) {
        return utenteRepository.findById(id);
    }

    public List<Utente> getAllUtente() {
        return utenteRepository.findAll();
    }

    public void deleteUtente(Long id) {
        utenteRepository.deleteById(id);
    }
}
