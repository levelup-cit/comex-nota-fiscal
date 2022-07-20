package br.com.alura.notafiscal.pedido.kafka;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ItemDePedidoConfirmadoEvent {

    private Long id;
    private BigDecimal precoUnitario;
    private Integer quantidade;
    private String produto;
    private String categoria;
    private BigDecimal desconto;
    private BigDecimal valorFinal;

}
