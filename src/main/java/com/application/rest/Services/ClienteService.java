package com.application.rest.Services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.rest.Entities.Cliente;
import com.application.rest.Entities.Prestamo;
import com.application.rest.Repositories.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public Cliente crearCliente(Cliente nvCliente){
        if (this.clienteRepository.existsById(nvCliente.getDni())) {
            return null;
        }

        List<Prestamo> prestamos = nvCliente.getPrestamo();
        if (prestamos != null) {
            for(Prestamo prestamo:prestamos){
                BigDecimal monto = prestamo.getMonto();
                Double i = 0.09/12;
                BigDecimal Total = new BigDecimal(i).multiply(monto);
                Double b = Math.pow(1.09, 60);
                BigDecimal TotalNumerador = new BigDecimal(b).multiply(Total);
                Double TotalDenominador = b - 1;
                BigDecimal TotalOperacion = new BigDecimal(TotalDenominador).divide(TotalNumerador);

                // prestamo.setCuota(TotalOperacion);
                prestamo.setCliente(nvCliente);
            }
        }
        
        return this.clienteRepository.save(nvCliente);
    }

    public List<Cliente> obtenerClientesPrestamos(){
        return this.clienteRepository.findAll();
    }
}
