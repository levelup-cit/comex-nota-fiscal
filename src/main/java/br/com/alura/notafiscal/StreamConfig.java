package br.com.alura.notafiscal;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.SubscribableChannel;

@EnableBinding(StreamConfig.PedidoPagoSink.class)
@Configuration
public class StreamConfig {

    interface PedidoPagoSink {

        String PEDIDO_PAGO_TOPIC = "pedidoPago";

        @Input
        SubscribableChannel pedidoPago();

    }
}
