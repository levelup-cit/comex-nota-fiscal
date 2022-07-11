package br.com.alura.notafiscal;

import org.springframework.stereotype.Service;

import br.com.alura.notafiscal.pedido.PedidoDto;

@Service
class ProcessadorDePagamentos {

	private final GeradorDeNotaFiscal notaFiscal;
  
  ProcessadorDePagamentos(GeradorDeNotaFiscal notaFiscal) {
    this.notaFiscal = notaFiscal;
  }
  
	void processaPagamento(PedidoDto pedidoDto) {
		String nota = notaFiscal.geraNotaPara(pedidoDto);
		System.out.println(nota); // TODO: enviar XML para SEFAZ
	}
}
