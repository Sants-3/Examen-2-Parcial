package com.application.rest.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.rest.Entities.Cliente;
import com.application.rest.Services.ClienteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;
    
    @PostMapping("crear/nuevo")
    public Cliente postMethodName(@RequestBody Cliente cliente) {
        return this.clienteService.crearCliente(cliente);
    }
    
    @GetMapping("obtenerClientesPrestamos")
    public List<Cliente> obtenerClientesPrestamos() {
        return this.clienteService.obtenerClientesPrestamos();
    }
    
}
