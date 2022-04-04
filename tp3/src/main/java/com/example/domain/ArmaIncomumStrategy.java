package com.example.domain;

public class ArmaIncomumStrategy implements ArmaStrategy {
    @Override
    public double getPrice(double precoBase, double desconto) {
        double precoFinal = (precoBase * (1 - desconto)) * 1.05;

        return precoFinal;
    }
}
