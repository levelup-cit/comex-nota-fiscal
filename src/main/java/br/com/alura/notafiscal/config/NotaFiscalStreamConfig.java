package br.com.alura.notafiscal.config;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.SubscribableChannel;

@Configuration
@EnableBinding(NotaFiscalStreamConfig.PedidoPagoSink.class)
public class NotaFiscalStreamConfig {

    public interface PedidoPagoSink {

        String PEDIDOS_PAGOS_TOPICO = "pedidosPagos";

        @Input
        SubscribableChannel pedidosPagos();

    }
}
