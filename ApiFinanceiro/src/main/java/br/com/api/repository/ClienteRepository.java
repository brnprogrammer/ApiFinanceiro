package br.com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
