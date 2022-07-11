package br.com.alura.notafiscal.pedido;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PedidoDto {

	private EntregaDto entrega;
	private ClienteDto cliente;
	private BigDecimal valorTotalComDescontos;
	private List<ItemDoPedidoDto> itens = new ArrayList<>();
	
	public PedidoDto() {
	}

	public PedidoDto(EntregaDto entrega, ClienteDto cliente, BigDecimal valorTotalComDescontos,
			List<ItemDoPedidoDto> itens) {
		this.entrega = entrega;
		this.cliente = cliente;
		this.valorTotalComDescontos = valorTotalComDescontos;
		this.itens = itens;
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
