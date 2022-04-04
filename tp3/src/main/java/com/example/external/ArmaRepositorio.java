package com.example.external;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import com.example.infra.Arma;
import com.example.infra.ArmaModel;

@Repository
public class ArmaRepositorio {
    // Lista de Testes
    //     private List<Arma> todasArmas = new ArrayList(Arrays.asList(new Arma("nome", "ataque", "dano", "raridade", "id", 0.2,  1000, 1500)));
    private List<Arma> todasArmas = new ArrayList();
    private List<Arma> armasLendarias = new ArrayList();
    private List<Arma> armasMuitoRaras = new ArrayList();
    private List<Arma> armasRaras = new ArrayList();
    private List<Arma> armasIncomuns = new ArrayList();
    private List<Arma> armasComuns = new ArrayList();

    public void create(Arma novaArma){
        switch (novaArma.getRaridade()){
            case "Lendário":
                armasLendarias.add(novaArma);
            case "Raro":
                armasRaras.add(novaArma);
            case "Muito Raro":
                armasMuitoRaras.add(novaArma);
            case "Incomum":
                armasIncomuns.add(novaArma);
            default:
                armasComuns.add(novaArma);
        }
        todasArmas.add(novaArma); 
    }
 
    public List<Arma> getAll(){
        return this.todasArmas;
    }

    public Arma get(String id){
        for(Arma arma : todasArmas){
                if (arma.getId().equals(id)){
                    return arma;
                }
        }
        return null;
    }

    public void edit(Arma novaArma, Arma arma){
        switch (novaArma.getRaridade()){
            case "Lendário":
                armasLendarias.remove(novaArma);
                armasLendarias.add(novaArma);
            case "Raro":
                armasRaras.remove(novaArma);
                armasRaras.add(novaArma);
            case "Muito Raro":
                armasMuitoRaras.remove(novaArma);
                armasMuitoRaras.add(novaArma);
            case "Incomum":
                armasIncomuns.remove(novaArma);
                armasIncomuns.add(novaArma);
            default:
                armasComuns.remove(novaArma);
                armasComuns.add(novaArma);
        }
        todasArmas.remove(arma);
        todasArmas.add(novaArma);
    }

    public void delete(Arma arma){
        todasArmas.remove(arma);
        switch (arma.getRaridade()){
            case "Lendário":
                armasLendarias.remove(arma);
            case "Raro":
                armasRaras.remove(arma);
            case "Muito Raro":
                armasMuitoRaras.remove(arma);
            case "Incomum":
                armasIncomuns.remove(arma);
            default:
                armasComuns.remove(arma);
        }
    }
}
