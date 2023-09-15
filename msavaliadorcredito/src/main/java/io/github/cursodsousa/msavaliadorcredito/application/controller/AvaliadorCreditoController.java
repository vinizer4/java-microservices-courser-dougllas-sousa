package io.github.cursodsousa.msavaliadorcredito.application.controller;

import io.github.cursodsousa.msavaliadorcredito.application.service.AvaliadorCreditoService;
import io.github.cursodsousa.msavaliadorcredito.domain.model.SituacaoCliente;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("avaliacoes-credito")
@RequiredArgsConstructor
public class AvaliadorCreditoController {

    private final AvaliadorCreditoService avaliadorCreditoService;

    @GetMapping
    public String status() {
        return "Serviço de avaliação de crédito está funcionando!";
    }


    @GetMapping(value = "situacao-cliente", params = "cpf")
    public ResponseEntity<SituacaoCliente> consultarSituacaoCliente(@RequestParam("cpf") String cpf) {
        SituacaoCliente situacaoCliente = avaliadorCreditoService.obterSituacaoCliente(cpf);

        return ResponseEntity.ok(situacaoCliente);
    }

}
