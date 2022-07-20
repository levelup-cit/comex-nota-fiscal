package br.com.alura.notafiscal;

import br.com.alura.notafiscal.pedido.ClienteDto;
import br.com.alura.notafiscal.pedido.EntregaDto;
import br.com.alura.notafiscal.pedido.ItemDoPedidoDto;
import br.com.alura.notafiscal.pedido.PedidoDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoPagoEvent {

    private BigDecimal valorTotal;

    private Long idCliente;

    private String cpfCliente;

    private String nomeCliente;

    private Long pedidoId;

    private StatusPedido status;

    private String endereco;

    private List<ItemDePedidoEvent> itemDePedidoEvents;

    public PedidoDto converter() {

        ClienteDto clienteDto = new ClienteDto(nomeCliente, cpfCliente);
        EntregaDto entregaDto = new EntregaDto("N/A", endereco);
        List<ItemDoPedidoDto> itemDoPedidoDto = itemDePedidoEvents.stream().map(ItemDoPedidoDto::new).toList();
        return new PedidoDto(entregaDto, clienteDto, valorTotal, itemDoPedidoDto);

    }

}
