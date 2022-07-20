package br.com.alura.notafiscal;

import br.com.alura.notafiscal.pedido.PedidoDto;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
class ProcessadorDePagamentos {

	private final GeradorDeNotaFiscal notaFiscal;
  
  ProcessadorDePagamentos(GeradorDeNotaFiscal notaFiscal) {
    this.notaFiscal = notaFiscal;
  }

	@StreamListener(StreamConfig.PedidoPagoSink.PEDIDO_PAGO_TOPIC)
	void processaPagamento(PedidoPagoEvent pedidoPagoEvent) {
	  	PedidoDto pedidoDto = pedidoPagoEvent.converter();
		String nota = notaFiscal.geraNotaPara(pedidoDto);
		System.out.println(nota); // TODO: enviar XML para SEFAZ
	}
}
