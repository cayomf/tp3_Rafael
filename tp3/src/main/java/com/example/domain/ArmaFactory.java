package com.example.domain;

public class ArmaFactory {

    public static ArmaStrategy getRarity(String raridade){
        switch (raridade){
            case "Lendário":
                return new ArmaLendariaStrategy();
            case "Raro":
                return new ArmaRaraStrategy();
            case "Muito Raro":
                return new ArmaMuitoRaraStrategy();
            case "Incomum":
                return new ArmaIncomumStrategy();
            case "Comum":
                return new ArmaComumStrategy();
            default:
                return null;
        }
    }
}
