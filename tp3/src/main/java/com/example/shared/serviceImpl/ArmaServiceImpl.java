package com.example.shared.serviceImpl;

import com.example.domain.ArmaFactory;
import com.example.external.ArmaRepositorio;
import com.example.infra.Arma;
import com.example.infra.ArmaModel;
import com.example.infra.ArmaResponse;
import com.example.shared.service.ArmaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArmaServiceImpl implements ArmaService{

    @Autowired
    ArmaRepositorio armaRepositorio;

    @Override
    public void create(ArmaModel novaArma) {
        Arma arma = new Arma();
        arma.setId(novaArma.getId());
        arma.setNome(novaArma.getNome());
        arma.setAtaque(novaArma.getAtaque());
        arma.setDano(novaArma.getDano());
        arma.setRaridade(novaArma.getRaridade());
        arma.setDesconto(novaArma.getDesconto());
        arma.setPrecoBase(arma.getRaridade());
        arma.setPrecoFinal(arma.getPrecoBase(), arma.getDesconto());

        armaRepositorio.create(arma);
    }

    @Override
    public void edit(Arma arma) {
        Arma velhaArma = armaRepositorio.get(arma.getId());
        Arma novaArma = new Arma();
        novaArma.setId(arma.getId());
        novaArma.setNome(arma.getNome());
        novaArma.setAtaque(arma.getAtaque());
        novaArma.setDano(arma.getDano());
        novaArma.setRaridade(arma.getRaridade());
        novaArma.setDesconto(arma.getDesconto());
        novaArma.setPrecoBase(arma.getRaridade());
        novaArma.setPrecoFinal(arma.getPrecoBase(), arma.getDesconto());
        armaRepositorio.edit(novaArma, velhaArma);
    }

    @Override
    public void delete(String id) {
        Arma arma = armaRepositorio.get(id);
        armaRepositorio.delete(arma);
    }

    @Override
    public List<ArmaResponse> getAll() {
        List<Arma> todasArmas = armaRepositorio.getAll();
        List<ArmaResponse> listaResposta = new ArrayList<>();

        for (Arma arma : todasArmas){
            ArmaResponse response = new ArmaResponse(arma.getNome(), arma.getAtaque(), arma.getDano(), arma.getRaridade(), arma.getId(), arma.getDesconto(), arma.getPrecoBase(), arma.getPrecoFinal());
            listaResposta.add(response);
        }
        return listaResposta;
    }

    @Override
    public ArmaResponse get(String id) {
        Arma arma = armaRepositorio.get(id);
        ArmaResponse armaResponse = new ArmaResponse(arma.getNome(), arma.getAtaque(), arma.getDano(), arma.getRaridade(), arma.getId(), arma.getDesconto(), arma.getPrecoBase(), arma.getPrecoFinal());
        return armaResponse;
    }
}
