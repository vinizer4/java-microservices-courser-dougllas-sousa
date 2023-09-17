package io.github.cursodsousa.msavaliadorcredito.application.exception;

public class DadosClienteNotFoundException extends Exception{
    public DadosClienteNotFoundException() {
        super("Dados cliente não encontrado para o cpf informado!");
    }
}
