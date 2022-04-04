package com.example.infra;

import com.example.domain.ArmaFactory;
import com.example.domain.ArmaStrategy;

public class Arma {
    private String id;
    private String nome;
    private String ataque;
    private String dano;
    private String raridade;
    private double desconto;
    private double precoBase;
    private double precoFinal;

    private ArmaFactory armaFactory;
    
    private ArmaSpecification armaSpecification;

    public Arma() {
    }

    public Arma(String nome, String ataque, String dano, String raridade, String id, double desconto, double precoBase, double precoFinal) {
        this.nome = nome;
        this.ataque = ataque;
        this.dano = dano;
        this.raridade = raridade;
        this.id = id;
        this.desconto = desconto;
        this.precoBase = precoBase;
        this.precoFinal = precoFinal;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(String raridade) {
        this.precoBase = buildBaseWeaponPrice(raridade);
    }

    public double buildBaseWeaponPrice(String raridade) {
        armaSpecification = new ArmaSpecification();
        return armaSpecification.baseWeaponPrice(raridade);
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(double precoBase, double desconto) {
        this.precoFinal = buildFinalWeaponPrice(precoBase, desconto);
    }

    public double buildFinalWeaponPrice(double precoBase, double desconto) {
        armaFactory = new ArmaFactory();
        return armaFactory.getRarity(raridade).getPrice(precoBase, desconto);
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
