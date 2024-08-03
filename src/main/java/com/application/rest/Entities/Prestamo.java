package com.application.rest.Entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "prestamos")
@Data
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoprestamo")
    private Long codigoPrestamo;

    @Column(name = "fechaapertura")
    private LocalDate fechaApertura;

    private BigDecimal monto;

    private int plazo;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "dni", referencedColumnName = "dni")
    private Cliente cliente;

    @OneToMany(mappedBy = "prestamo", cascade = CascadeType.ALL)
    private List<Cuota> cuota;
}
