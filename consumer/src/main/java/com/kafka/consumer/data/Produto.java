package com.kafka.consumer.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto {
    private String codigo;
    private String descricao;
    private BigDecimal valor;
    private int quantidade;
}
