package io.github.cursodsousa.msavaliadorcredito.application.service;

import io.github.cursodsousa.msavaliadorcredito.domain.model.DadosCliente;
import io.github.cursodsousa.msavaliadorcredito.domain.model.SituacaoCliente;
import io.github.cursodsousa.msavaliadorcredito.infra.clients.ClienteResourceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AvaliadorCreditoService {

    private final ClienteResourceClient clientesClient;

    public SituacaoCliente obterSituacaoCliente(String cpf) {

        ResponseEntity<DadosCliente> dadosClienteResponse = clientesClient.dadosCliente(cpf);

        return SituacaoCliente.builder()
                .dadosCliente(dadosClienteResponse.getBody())
                .build();
    }
}
