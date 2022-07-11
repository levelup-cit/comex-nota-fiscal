package br.com.alura.notafiscal;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.com.alura.notafiscal.pedido.PedidoDto;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

@Service
class GeradorDeNotaFiscal {

	private final Configuration freemarkerConfiguration;
	
  GeradorDeNotaFiscal(Configuration freemarkerConfiguration) {
    this.freemarkerConfiguration = freemarkerConfiguration;
  }

	String geraNotaPara(PedidoDto pedido) {
		try {
			Map<String, Object> data = new HashMap<>();
			data.put("pedido", pedido);
			Template template = freemarkerConfiguration.getTemplate("nota-fiscal.ftl");
			StringWriter out = new StringWriter();
			template.process(data, out);
			return out.toString();
		} catch (TemplateException | IOException e) {
			throw new RuntimeException("Erro ao gerar nota fiscal", e);
		}
	}
}
