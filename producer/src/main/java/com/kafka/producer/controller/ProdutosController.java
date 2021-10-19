package com.kafka.producer.controller;

import com.kafka.producer.data.Produto;
import com.kafka.producer.services.RegistraEventoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class ProdutosController {

    private final RegistraEventoService eventoService;

    public ProdutosController(RegistraEventoService eventoService) {
        this.eventoService = eventoService;
    }

    @PostMapping(path = "/api/salvar-produto")
    public ResponseEntity<String> salvarProduto(@RequestBody Produto produto){
        produto.setCodigo(UUID.randomUUID().toString());
        eventoService.adicionarEvento("salvarProduto", produto);
        return ResponseEntity.ok("Sucesso ao adicionar evento");
    }

}
