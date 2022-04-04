package com.example.domain;

public class ArmaLendariaStrategy implements ArmaStrategy {
    @Override
    public double getPrice(double precoBase, double desconto) {
        double precoFinal = (precoBase * (1 - desconto)) * 1.4;

        return precoFinal;
    }
}
