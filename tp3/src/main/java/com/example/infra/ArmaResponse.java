 package com.example.infra;

public class ArmaResponse {
    private String id;
    private String nome;
    private String ataque;
    private String dano;
    private String raridade;
    private double desconto;
    private double precoBase;
    private double precoFinal;
    
    public ArmaResponse() {
    }

    public ArmaResponse(String nome, String ataque, String dano, String raridade, String id, double desconto, double precoBase, double precoFinal) {
        this.nome = nome;
        this.ataque = ataque;
        this.dano = dano;
        this.raridade = raridade;
        this.id = id;
        this.desconto = desconto;
        this.precoBase = precoBase;
        this.precoFinal = precoFinal;
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

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }
}
