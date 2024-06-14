package br.com.alura.sreenmatch_frases.service;

import br.com.alura.sreenmatch_frases.dto.FraseDTO;
import br.com.alura.sreenmatch_frases.model.Frase;
import br.com.alura.sreenmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repositorio;

    public FraseDTO obterFrasesAleatorias(){
        Frase frase = repositorio.buscarFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
