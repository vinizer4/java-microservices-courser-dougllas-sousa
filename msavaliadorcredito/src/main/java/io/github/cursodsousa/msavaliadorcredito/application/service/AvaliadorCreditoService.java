package io.github.cursodsousa.msavaliadorcredito.application.service;

import io.github.cursodsousa.msavaliadorcredito.domain.model.CartaoCliente;
import io.github.cursodsousa.msavaliadorcredito.domain.model.DadosCliente;
import io.github.cursodsousa.msavaliadorcredito.domain.model.SituacaoCliente;
import io.github.cursodsousa.msavaliadorcredito.infra.clients.CartoesResourceClient;
import io.github.cursodsousa.msavaliadorcredito.infra.clients.ClienteResourceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AvaliadorCreditoService {

    private final ClienteResourceClient clientesClient;
    private final CartoesResourceClient cartoesClient;

    public SituacaoCliente obterSituacaoCliente(String cpf) {

        ResponseEntity<DadosCliente> dadosClienteResponse = clientesClient.dadosCliente(cpf);

        ResponseEntity<List<CartaoCliente>> cartoesResponse = cartoesClient.getCartoesByCliente(cpf);

        return SituacaoCliente.builder()
                .dadosCliente(dadosClienteResponse.getBody())
                .cartoes(cartoesResponse.getBody())
                .build();
    }
}
