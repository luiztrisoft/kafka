package com.kafka.consumer.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kafka.consumer.data.Produto;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProdutoService {

    @KafkaListener(topics = "salvarProduto", groupId = "groupIdSalvarProduto")
    private void executar(ConsumerRecord<String, String> record){

        String dados = record.value();
        ObjectMapper mapper = new ObjectMapper();
        Produto produto;

        try{
            produto = mapper.readValue(dados, Produto.class);
        }catch (JsonProcessingException e){
            return;
        }

        log.info("Evento recebido = {}", produto);
        salvar(produto);
    }

    private void salvar(Produto produto) {
        // Salvar produto no banco de dados
        // Responder para a fila que o produto foi salvo
    }
}
