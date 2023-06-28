package com.CorsoOpinnoJava.gestioneprenotazionispring.service;

import com.CorsoOpinnoJava.gestioneprenotazionispring.model.Citta;
import com.CorsoOpinnoJava.gestioneprenotazionispring.repository.CittaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CittaService {

    @Autowired
    CittaRepository cittaRepository;

    public Citta saveCitta(Citta citta) {
        return cittaRepository.save(citta);
    }

    public Optional<Citta> getCittaById(Long id) {
        return cittaRepository.findById(id);
    }

    public List<Citta> getAllCitta() {
        return cittaRepository.findAll();
    }

    public void deleteCitta(Long id) {
        cittaRepository.deleteById(id);
    }
}
