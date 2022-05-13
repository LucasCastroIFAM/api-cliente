package br.edu.ifam.apicliente.repository;

import br.edu.ifam.apicliente.entity.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
