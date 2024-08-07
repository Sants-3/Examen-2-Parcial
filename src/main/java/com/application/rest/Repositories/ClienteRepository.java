package com.application.rest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.rest.Entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String>{

}
