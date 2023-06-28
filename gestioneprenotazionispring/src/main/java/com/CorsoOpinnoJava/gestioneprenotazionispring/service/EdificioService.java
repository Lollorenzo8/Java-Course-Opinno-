package com.CorsoOpinnoJava.gestioneprenotazionispring.service;

import com.CorsoOpinnoJava.gestioneprenotazionispring.model.Citta;
import com.CorsoOpinnoJava.gestioneprenotazionispring.model.Edificio;
import com.CorsoOpinnoJava.gestioneprenotazionispring.repository.CittaRepository;
import com.CorsoOpinnoJava.gestioneprenotazionispring.repository.EdificioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EdificioService {
    @Autowired
    EdificioRepository edificioRepository;

    public Edificio saveEdificio(Edificio edificio) {
        return edificioRepository.save(edificio);
    }

    public Optional<Edificio> getEdificioById(Long id) {
        return edificioRepository.findById(id);
    }

    public List<Edificio> getAllEdificio() {
        return edificioRepository.findAll();
    }

    public void deleteEdificio(Long id) {
        edificioRepository.deleteById(id);
    }
}
