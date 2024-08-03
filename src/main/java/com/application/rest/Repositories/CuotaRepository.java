package com.application.rest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.rest.Entities.Cuota;

@Repository
public interface CuotaRepository extends JpaRepository<Cuota, Long>{

}
