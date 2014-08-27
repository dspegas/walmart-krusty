package br.com.walmart.test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;
import org.junit.Test;

import br.com.walmart.model.Pedido;
import br.com.walmart.model.Produto;
import br.com.walmart.model.StatusPedido;
import br.com.walmart.model.TipoProduto;

public class SalvaPedidoTest {

	static final String ROOT_URL_SALVA = "http://localhost:8080/KrustyWS/rest/pedido/salva/";

	@Test
	public void testSalvaPedido() throws Exception {
		
		Produto produto = new Produto();
		produto.setDescricao("KRUSTY");
		produto.setPreco(new BigInteger("100"));
		produto.setTipoProduto(TipoProduto.Hamburguer);
		
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(produto);
		
		Pedido pedido = new Pedido();
		pedido.setStatus(StatusPedido.Pedido);
		pedido.setProdutos(produtos);
		
		ClientRequest request = new ClientRequest(ROOT_URL_SALVA);
		request.body("application/json", pedido);
		ClientResponse<String> response = request.post(String.class);
		String statusXML = response.getEntity();
		Assert.assertNotNull(statusXML);
	}

}
