package com.example.tp3;

import com.example.external.ArmaRepositorio;
import com.example.infra.Arma;
import com.example.infra.ArmaResponse;
import com.example.shared.service.ArmaService;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class RepositorioTeste {

    @Autowired
    ArmaRepositorio armaRepository;

    @Test
    public void get(){
        Arma armaTeste = new Arma("nome", "ataque", "dano", "raridade", "id", 0.2,  1000, 1500);
        Arma arma = armaRepository.get("id");

        Assert.assertEquals(arma.getAtaque(), armaTeste.getAtaque());
        Assert.assertEquals(arma.getNome(), armaTeste.getNome());
        Assert.assertEquals(arma.getDano(), armaTeste.getDano());
        Assert.assertEquals(arma.getId(), armaTeste.getId());
        Assert.assertEquals(arma.getRaridade(), armaTeste.getRaridade());
    }

    @Test
    public void getAll(){
        List<Arma> armas = armaRepository.getAll();

        Assert.assertEquals(armas.isEmpty(), true);
    }

    @Test
    public void create(){
        Arma arma = new Arma("nome", "ataque", "dano", "raridade", "id", 0.2,  1000, 1500);
        List<Arma> armas = armaRepository.getAll();
        Assert.assertEquals(armas.isEmpty(), true);
        armaRepository.create(arma);
        Assert.assertEquals(armas.isEmpty(), false);
    }

    @Test
    public void edit(){
        Arma arma = new Arma("nome", "ataque", "dano", "raridade", "id", 0.2,  1000, 1500);
        Arma armaEditada = new Arma("nome2", "ataque", "dano", "raridade", "id", 0.2,  1000, 1500);
        List<Arma> armas = armaRepository.getAll();
        armaRepository.create(arma);
        armaRepository.edit(armaEditada, arma);
        Arma novaArma = armaRepository.get("id");
        Assert.assertEquals(novaArma.getNome(), armaEditada.getNome());
    }
}
