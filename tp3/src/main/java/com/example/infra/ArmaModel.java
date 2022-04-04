package com.example.infra;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArmaModel {
    @JsonProperty
    private String id;
    @JsonProperty
    private String nome;
    @JsonProperty
    private double desconto;
    @JsonProperty
    private String raridade;
    @JsonProperty
    private String ataque;
    @JsonProperty
    private String dano;

    public ArmaModel() {
    }

    public ArmaModel(String id, String nome, double desconto, String ataque, String dano, String raridade) {
        this.id = id;
        this.nome = nome;
        this.desconto = desconto;
        this.ataque = ataque;
        this.dano = dano;
        this.raridade = raridade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getAtaque() {
        return ataque;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }

    public String getDano() {
        return dano;
    }

    public void setDano(String dano) {
        this.dano = dano;
    }

    public String getRaridade() {
        return raridade;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }
}