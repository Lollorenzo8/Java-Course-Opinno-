package com.CorsoOpinnoJava.gestioneprenotazionispring;

import com.CorsoOpinnoJava.gestioneprenotazionispring.model.Citta;
import com.CorsoOpinnoJava.gestioneprenotazionispring.model.Utente;
import com.CorsoOpinnoJava.gestioneprenotazionispring.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CittaService cittaService;
    @Autowired
    EdificioService edificioService;
    @Autowired
    PostazioneService postazioneService;
    @Autowired
    PrenotazioneService prenotazioneService;
    @Autowired
    UtenteService utenteService;

    @Override
    public void run(String... args) throws Exception {

        Citta c1 = new Citta("Zurigo");
        cittaService.saveCitta(c1);

    }
}
