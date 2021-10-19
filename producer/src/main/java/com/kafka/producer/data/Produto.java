package com.kafka.producer.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto {
    private String codigo;
    private String descricao;
    private BigDecimal valor;
    private int quantidade;

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
