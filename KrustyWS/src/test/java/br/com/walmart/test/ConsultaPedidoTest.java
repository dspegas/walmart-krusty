package br.com.walmart.test;

import junit.framework.Assert;

import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;
import org.jboss.resteasy.util.GenericType;
import org.junit.Test;

import br.com.walmart.model.Pedido;

public class ConsultaPedidoTest {
	static final String ROOT_URL_CONSULTA = "http://localhost:8080/KrustyWS/rest/pedido/consulta/";

	@Test
	public void testConsultaPedido() throws Exception {
		ClientRequest request = new ClientRequest(ROOT_URL_CONSULTA + "1");
		ClientResponse<Pedido> response = request.get(new GenericType<Pedido>() {});
		Pedido pedido = response.getEntity();
		Assert.assertNotNull(pedido);
	}

}
