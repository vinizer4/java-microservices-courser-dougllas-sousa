package io.github.cursodsousa.msclientes.infra.repository;

import io.github.cursodsousa.msclientes.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
