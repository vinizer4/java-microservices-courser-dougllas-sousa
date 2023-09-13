package io.github.cursodsousa.msclientes.application.representation;

import io.github.cursodsousa.msclientes.domain.Cliente;
import lombok.Data;

@Data
public class ClienteSaveRequest {
    private String nome;
    private String cpf;
    private String idade;

    public Cliente toModel() {
        return new Cliente(nome, cpf, idade);
    }
}
