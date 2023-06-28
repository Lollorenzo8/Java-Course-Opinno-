package com.CorsoOpinnoJava.gestioneprenotazionispring.service;

import com.CorsoOpinnoJava.gestioneprenotazionispring.model.Edificio;
import com.CorsoOpinnoJava.gestioneprenotazionispring.model.Postazione;
import com.CorsoOpinnoJava.gestioneprenotazionispring.repository.EdificioRepository;
import com.CorsoOpinnoJava.gestioneprenotazionispring.repository.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PostazioneService {
    @Autowired
    PostazioneRepository postazioneRepository;

    public Postazione savePostazione(Postazione postazione) {
        return postazioneRepository.save(postazione);
    }

    public Optional<Postazione> getPostazioneById(Long id) {
        return postazioneRepository.findById(id);
    }

    public List<Postazione> getAllPostazione() {
        return postazioneRepository.findAll();
    }

    public void deletePostazione(Long id) {
        postazioneRepository.deleteById(id);
    }
}
