package br.com.alura.sreenmatch_frases.controller;

import br.com.alura.sreenmatch_frases.dto.FraseDTO;
import br.com.alura.sreenmatch_frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    private FraseService servico;

    @GetMapping("/series/frases")
    public FraseDTO obterFrasesAleatorias(){
        return servico.obterFrasesAleatorias();
    }
}
