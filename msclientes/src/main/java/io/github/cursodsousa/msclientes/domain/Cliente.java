package io.github.cursodsousa.msclientes.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private String cpf;

    @Column
    private String idade;

    public Cliente(String nome, String cpf, String idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
}
