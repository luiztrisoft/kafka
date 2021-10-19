package com.kafka.producer.services;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class RegistraEventoService {

    private final KafkaTemplate<Object, Object> kafkaTemplate;

    public RegistraEventoService(KafkaTemplate<Object, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public <T> void adicionarEvento(String topico, T dados) {
        kafkaTemplate.send(topico, dados);
    }
}