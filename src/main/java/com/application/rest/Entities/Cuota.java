package com.application.rest.Entities;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cuotas")
@Data
public class Cuota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigocuota")
    private Long codigoCuota;

    private int mes;

    private BigDecimal interes;

    private BigDecimal capital;

    private BigDecimal saldo;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "codigoprestamo", referencedColumnName = "codigoprestamo")
    private Prestamo prestamo;
}
