<xml>
	<loja>314276853</loja>
	<nat_operacao>Comércio eletrônico</nat_operacao>
	<pedido>
		<vlr_total>${(pedido.valorTotalComDescontos)?string["#,##0.00"]}</vlr_total>
		<items>
			<#list pedido.itens as item>
			<item>
				<descricao>${item.nome}</descricao>
				<un>un</un>
				<codigo>004</codigo>
				<qtde>${item.quantidade}</qtde>
				<vlr_unit>${(item.precoUnitario)?string["#,##0.00"]}</vlr_unit>
				<tipo>P</tipo>
				<class_fiscal>94032000</class_fiscal>
			</item>
			</#list>
		</items>
	</pedido>
	<cliente>
		<nome>${pedido.cliente.nome}</nome>
		<tipoPessoa>F</tipoPessoa>
		<contribuinte>9</contribuinte>
		<cpf_cnpj>${pedido.cliente.cpf}</cpf_cnpj>
		<endereco>${pedido.entrega.enderecoCompleto}</endereco>
		<cep>${pedido.entrega.cep}</cep>
	</cliente>
</xml>