package com.BancoDeDados.escola.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Aluno {

    @Id
    private Long id;
    private String nome;
    private Integer anoEntrada;

    public Aluno() {
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoEntrada() {
        return anoEntrada;
    }

    public void setAnoEntrada(Integer anoEntrada) {
        this.anoEntrada = anoEntrada;
    }
}