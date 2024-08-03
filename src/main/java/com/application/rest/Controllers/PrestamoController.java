package com.application.rest.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.rest.Entities.Prestamo;
import com.application.rest.Services.PrestamoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/prestamo")
public class PrestamoController {

    @Autowired
    PrestamoService prestamoService;

    @PostMapping("/crear/prestamo/{dni}")
    public Prestamo crearPrestamo(@PathVariable(name = "dni") String dni, @RequestBody Prestamo prestamo) {
        return this.prestamoService.crearPrestamo(dni, prestamo);
    }
    

    @GetMapping("/buscar/prestamo/{codigoPrestamo}")
    public Prestamo obtenerPrestamoYCuotas(@PathVariable(name = "codigoPrestamo") Long codigoPrestamo) {
        return this.prestamoService.buscarPorCodigoPrestamo(codigoPrestamo);
    }
    
}
