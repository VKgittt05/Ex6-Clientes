package com.Gerenciamento_Clientes.Clientes.repositories;


import com.Gerenciamento_Clientes.Clientes.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}

