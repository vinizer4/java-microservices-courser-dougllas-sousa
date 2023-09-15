package io.github.cursodsousa.msavaliadorcredito.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("avaliacoes-credito")
public class AvaliadorCreditoController {

    @GetMapping
    public String status() {
        return "Serviço de avaliação de crédito está funcionando!";
    }


}
