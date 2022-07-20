package br.com.alura.notafiscal;

import br.com.alura.notafiscal.config.NotaFiscalStreamConfig;
import br.com.alura.notafiscal.pedido.PedidoDto;
import br.com.alura.notafiscal.pedido.kafka.PedidoPagoEvent;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
class ProcessadorDePagamentos {

	private final GeradorDeNotaFiscal notaFiscal;
  
  	ProcessadorDePagamentos(GeradorDeNotaFiscal notaFiscal) {
    this.notaFiscal = notaFiscal;
  }


  	@StreamListener(NotaFiscalStreamConfig.PedidoPagoSink.PEDIDOS_PAGOS_TOPICO)
	void processaPagamento(PedidoPagoEvent pedidoPagoEvent){
		PedidoDto pedido = new PedidoDto(pedidoPagoEvent);
		  String nota = notaFiscal.geraNotaPara(pedido);
		System.out.println(nota);


	}
//	void processaPagamento(PedidoDto pedidoDto) {
//		String nota = notaFiscal.geraNotaPara(pedidoDto);
//		System.out.println(nota); // TODO: enviar XML para SEFAZ
//	}
}
