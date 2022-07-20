package br.com.alura.notafiscal.pedido;

public class EntregaDto {

	private String estado;
	private String enderecoCompleto;

	public EntregaDto() {
	}

	public EntregaDto(String estado, String enderecoCompleto) {
		this.estado = estado;
		this.enderecoCompleto = enderecoCompleto;
	}

	public String getCep() {
		return estado;
	}

	public void setCep(String cep) {
		this.estado = cep;
	}

	public String getEnderecoCompleto() {
		return enderecoCompleto;
	}

	public void setEnderecoCompleto(String enderecoCompleto) {
		this.enderecoCompleto = enderecoCompleto;
	}

	@Override
	public String toString() {
		return "EntregaDto [cep=" + estado + ", enderecoCompleto=" + enderecoCompleto + "]";
	}

}
