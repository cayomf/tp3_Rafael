package com.example.infra;

public class ArmaSpecification {

    public int baseWeaponPrice(String raridade){
        switch (raridade){
            case "Lendário":
                return 30000;
            case "Muito Raro":
                return 15000;
            case "Raro":
                return 5000;
            case "Incomum":
                return 500;
            default:
                return 75;
        }
    }
}
