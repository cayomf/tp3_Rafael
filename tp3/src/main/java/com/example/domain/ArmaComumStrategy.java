package com.example.domain;

public class ArmaComumStrategy implements ArmaStrategy {
    @Override
    public double getPrice(double precoBase, double desconto) {
        double precoFinal = (precoBase * (1 - desconto));

        return precoFinal;
    }
}
