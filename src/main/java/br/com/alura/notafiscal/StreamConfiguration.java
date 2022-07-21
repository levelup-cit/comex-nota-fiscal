package br.com.alura.notafiscal;

import br.com.alura.notafiscal.pedido.PedidoDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class StreamConfiguration {

  @Bean
  public Consumer<PedidoDto> consumidorDeNotasFiscais(ProcessadorDePagamentos processadorDePagamentos) {
    return pedidoDto -> processadorDePagamentos.processaPagamento(pedidoDto);
  }

}
