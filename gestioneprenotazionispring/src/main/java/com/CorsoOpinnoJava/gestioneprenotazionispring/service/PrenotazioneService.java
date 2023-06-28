package com.CorsoOpinnoJava.gestioneprenotazionispring.service;

import com.CorsoOpinnoJava.gestioneprenotazionispring.model.Citta;
import com.CorsoOpinnoJava.gestioneprenotazionispring.model.Prenotazione;
import com.CorsoOpinnoJava.gestioneprenotazionispring.repository.CittaRepository;
import com.CorsoOpinnoJava.gestioneprenotazionispring.repository.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrenotazioneService {
    @Autowired
    PrenotazioneRepository prenotazioneRepository;

    public Prenotazione savePrenotazione(Prenotazione prenotazione) {
        return prenotazioneRepository.save(prenotazione);
    }

    public Optional<Prenotazione> getPrenotazioneById(Long id) {
        return prenotazioneRepository.findById(id);
    }

    public List<Prenotazione> getAllPrenotazione() {
        return prenotazioneRepository.findAll();
    }

    public void deletePrenotazione(Long id) {
        prenotazioneRepository.deleteById(id);
    }
}
