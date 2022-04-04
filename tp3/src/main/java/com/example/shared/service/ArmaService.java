package com.example.shared.service;

import com.example.infra.Arma;
import com.example.infra.ArmaModel;
import com.example.infra.ArmaResponse;

import java.util.List;

public interface ArmaService {
    public ArmaResponse get(String id);
    public void create(ArmaModel novaArma);
    public void edit(Arma novaArma);
    public void delete(String id);
    public List<ArmaResponse> getAll();
}
