package br.com.alura.notafiscal.pedido;

import br.com.alura.notafiscal.pedido.kafka.PedidoPagoEvent;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PedidoDto {

	private EntregaDto entrega;
	private ClienteDto cliente;
	private BigDecimal valorTotalComDescontos;
	private List<ItemDoPedidoDto> itens = new ArrayList<>();
	
	public PedidoDto() {
	}

	public PedidoDto(PedidoPagoEvent pedidoPagoEvent) {
		this.entrega = new EntregaDto(pedidoPagoEvent.getEstado(), pedidoPagoEvent.getEnderecoCompleto());
		this.cliente = new ClienteDto(pedidoPagoEvent.getNomeCliente(), pedidoPagoEvent.getCpfClient());
		this.valorTotalComDescontos = pedidoPagoEvent.getValorTotal();
		this.itens = pedidoPagoEvent.getItens().stream().map(ItemDoPedidoDto::new).collect(Collectors.toList());
	}

	public EntregaDto getEntrega() {
		return entrega;
	}

	public void setEntrega(EntregaDto entrega) {
		this.entrega = entrega;
	}

	public ClienteDto getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDto cliente) {
		this.cliente = cliente;
	}

	public BigDecimal getValorTotalComDescontos() {
		return valorTotalComDescontos;
	}

	public void setValorTotalComDescontos(BigDecimal valorTotalComDescontos) {
		this.valorTotalComDescontos = valorTotalComDescontos;
	}

	public List<ItemDoPedidoDto> getItens() {
		return itens;
	}

	public void setItens(List<ItemDoPedidoDto> itens) {
		this.itens = itens;
	}

	@Override
	public String toString() {
		return "PedidoDto [cliente=" + cliente + ", entrega=" + entrega + ", itens=" + itens
				+ ", valorTotalComDescontos=" + valorTotalComDescontos + "]";
	}

}
