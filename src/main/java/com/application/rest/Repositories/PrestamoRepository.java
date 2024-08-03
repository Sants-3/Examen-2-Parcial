package com.application.rest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.rest.Entities.Prestamo;

@Repository
public interface PrestamoRepository extends JpaRepository<Prestamo, Long>{

}
