package com.senai.rental_eventos.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="equipamento")
public class Equipamento {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "marca")
    private String marca;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "potencia")
    private String potencia;

    @Column(name = "material")
    private String material;

    @Column(name = "peso")
    private String peso;

    @Column(name = "dimensoes")
    private String dimensoes;

    @Column(name = "cor")
    private String cor;

    @Column(name = "quantidade_disponivel")
    private String quantidade_disponivel;

    @Column(name = "quantidade_minima")
    private String quantidade_minima;
}
