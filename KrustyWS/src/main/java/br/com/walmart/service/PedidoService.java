package br.com.walmart.service;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.walmart.model.Pedido;

public interface PedidoService {

	public String salvaPedido(Pedido pedido);
	
	public String atualizarPedido(Pedido pedido);
	
	public List<Pedido> consultarPedido(Long numeroMesa);
	
	public List<Pedido> findByStatus(String status);
	
}
