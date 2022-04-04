package com.example.domain;

public class ArmaMuitoRaraStrategy implements ArmaStrategy {
    @Override
    public double getPrice(double precoBase, double desconto) {
        double precoFinal = (precoBase * (1 - desconto)) * 1.3;

        return precoFinal;
    }
}
