package com.application.rest.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.rest.Entities.Prestamo;
import com.application.rest.Repositories.ClienteRepository;
import com.application.rest.Repositories.PrestamoRepository;

@Service
public class PrestamoService {

    @Autowired
    PrestamoRepository prestamoRepository;

    @Autowired
    ClienteRepository clienteRepository;
    
    public Prestamo crearPrestamo(String dni, Prestamo prestamo){
        if (this.clienteRepository.existsById(dni)) {
            prestamo.setCliente(this.clienteRepository.findById(dni).get());
            return this.prestamoRepository.save(prestamo);
        }

        return null;
    }

    public Prestamo buscarPorCodigoPrestamo(Long codigoPrestamo){
        return this.prestamoRepository.findById(codigoPrestamo).get();
    }
}
