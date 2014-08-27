package br.com.walmart.webservice.impl;

import javax.ws.rs.core.Response;

import br.com.walmart.model.Pedido;
import br.com.walmart.service.PedidoService;
import br.com.walmart.webservice.PedidoWS;


public class PedidoWSImpl implements PedidoWS{
	
	 private PedidoService pedidoService;
	 
	 public PedidoWSImpl(){}
	 
	 public PedidoWSImpl(PedidoService pedidoService) {
	  this.pedidoService = pedidoService;
	 }

	public Response consultaPedido(Long id_pedido) {
		return Response.status(200).entity(pedidoService.consultarPedido(id_pedido)).build();
	}

	public Response salvaPedido(Pedido pedido) {
		return Response.status(200).entity(pedidoService.salvaPedido(pedido)).build();
	}

	public Response atualizaPedido(Pedido pedido) {
		return Response.status(200).entity(pedidoService.atualizarPedido(pedido)).build();
	} 
	
	public Response consultaPedidoStatus(String status) {
		return Response.status(200).entity(pedidoService.findByStatus(status)).build();
	}


}
