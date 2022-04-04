package com.example.external.controller;

import com.example.infra.Arma;
import com.example.infra.ArmaModel;
import com.example.infra.ArmaResponse;
import com.example.shared.service.ArmaService;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ArmaController {

    @Autowired
    ArmaService armaService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody ArmaModel novaArma){
        try {
            armaService.create(novaArma);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            System.out.println(e.toString());
            return new ResponseEntity<>(e.toString(), HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/edit")
    public ResponseEntity<?> edit(@RequestParam String dano,
                                    @RequestParam String nome,
                                    @RequestParam String raridade,
                                    @RequestParam double desconto,
                                    @RequestParam String ataque,
                                    @RequestParam String id){   
        Arma arma = new Arma();
        arma.setId(id);
        arma.setNome(nome);
        arma.setAtaque(ataque);
        arma.setDano(dano);
        arma.setRaridade(raridade);
        arma.setDesconto(desconto);
        arma.setPrecoBase(arma.getRaridade());
        arma.setPrecoFinal(arma.getPrecoBase(), arma.getDesconto());
        try{
            armaService.edit(arma);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (Exception e){
            return new ResponseEntity<>(e.toString(), HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> delete(@RequestParam String id){
        try {
            armaService.delete(id);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/details")
    public ResponseEntity<?> listarUSer(@RequestParam String id){
        try{
            ArmaResponse arma = armaService.get(id);
            return ResponseEntity.ok(arma);
        } catch (Exception e){
            return new ResponseEntity<>(e.toString(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){

        try{
            List<ArmaResponse> armas = armaService.getAll();
            return ResponseEntity.ok(armas);
        } catch (Exception e){
            return new ResponseEntity<>(e.toString(), HttpStatus.BAD_REQUEST);
        }
    }
}
