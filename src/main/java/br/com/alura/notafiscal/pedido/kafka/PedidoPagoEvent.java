package br.com.alura.notafiscal.pedido.kafka;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PedidoPagoEvent {

    private Long id;
    private LocalDate data;
    private BigDecimal valorTotal;
    private BigDecimal desconto;
    private List<ItemDePedidoConfirmadoEvent> itens = new ArrayList<>();
    private String cpfClient;
    private String nomeCliente;
    private String statusPedido;
    private String enderecoCompleto;
    private String estado;

}
