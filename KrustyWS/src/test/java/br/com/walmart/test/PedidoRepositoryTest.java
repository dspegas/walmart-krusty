package br.com.walmart.test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.walmart.model.Pedido;
import br.com.walmart.model.Produto;
import br.com.walmart.model.StatusPedido;
import br.com.walmart.model.TipoProduto;
import br.com.walmart.repository.PedidoRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/WEB-INF/application-Context.xml" })
public class PedidoRepositoryTest {

	@Autowired
	private PedidoRepository repositorio;

	@Test
	// teste para salvar pedido
	public void salvaPedido() throws Exception {

		Produto produto = new Produto();
		produto.setDescricao("KRUSTY");
		produto.setPreco(new BigInteger("100"));
		produto.setTipoProduto(TipoProduto.Hamburguer);

		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(produto);

		Pedido pedido = new Pedido();
		pedido.setStatus(StatusPedido.Pedido);
		pedido.setProdutos(produtos);
		Assert.assertEquals("Pedido efetuado com sucesso.",
				repositorio.savePedido(pedido));

	}

}
