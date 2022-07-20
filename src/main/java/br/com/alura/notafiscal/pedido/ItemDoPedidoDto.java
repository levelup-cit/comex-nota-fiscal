package br.com.alura.notafiscal.pedido;

import br.com.alura.notafiscal.ItemDePedidoEvent;

import java.math.BigDecimal;

public class ItemDoPedidoDto {

	private String nome;
	private long quantidade;
	private BigDecimal precoUnitario;

	public ItemDoPedidoDto() {
	}

	public ItemDoPedidoDto(ItemDePedidoEvent itemDePedidoEvent) {
		this.nome = itemDePedidoEvent.getNomeProduto();
		this.quantidade = itemDePedidoEvent.getQuantidade();
		this.precoUnitario = itemDePedidoEvent.getPrecoUnitario();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(BigDecimal precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	@Override
	public String toString() {
		return "ItemDoPedidoDto [nome=" + nome 
				+ ", precoUnitario=" + precoUnitario + ", quantidade=" + quantidade + "]";
	}

}
