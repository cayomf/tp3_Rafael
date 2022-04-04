package com.example.domain;

public class ArmaRaraStrategy implements ArmaStrategy {
    @Override
    public double getPrice(double precoBase, double desconto) {
        double precoFinal = (precoBase * (1 - desconto)) * 1.225;

        return precoFinal;
    }
}
