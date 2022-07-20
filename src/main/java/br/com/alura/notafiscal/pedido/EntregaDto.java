package br.com.alura.notafiscal.pedido;

public class EntregaDto {

	private String cep = "N/A";
	private String enderecoCompleto;

	public EntregaDto() {
	}

	public EntregaDto(String cep, String enderecoCompleto) {
		this.cep = cep;
		this.enderecoCompleto = enderecoCompleto;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEnderecoCompleto() {
		return enderecoCompleto;
	}

	public void setEnderecoCompleto(String enderecoCompleto) {
		this.enderecoCompleto = enderecoCompleto;
	}

	@Override
	public String toString() {
		return "EntregaDto [cep=" + cep + ", enderecoCompleto=" + enderecoCompleto + "]";
	}

}
