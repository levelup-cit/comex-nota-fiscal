package br.com.alura.notafiscal.pedido;

import br.com.alura.notafiscal.pedido.kafka.ItemDePedidoConfirmadoEvent;

import java.math.BigDecimal;

public class ItemDoPedidoDto {

	private String nome;
	private Integer quantidade;
	private BigDecimal precoUnitario;

	public ItemDoPedidoDto() {
	}

//	public ItemDoPedidoDto(String nome, Integer quantidade, BigDecimal precoUnitario,
//			BigDecimal precoTotalComDescontos) {
//		this.nome = nome;
//		this.quantidade = quantidade;
//		this.precoUnitario = precoUnitario;
//	}

	public ItemDoPedidoDto(ItemDePedidoConfirmadoEvent itemDePedidoConfirmadoEvent) {
		this.nome = itemDePedidoConfirmadoEvent.getProduto();
		this.quantidade = itemDePedidoConfirmadoEvent.getQuantidade();
		this.precoUnitario = itemDePedidoConfirmadoEvent.getPrecoUnitario();
	}

    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
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
