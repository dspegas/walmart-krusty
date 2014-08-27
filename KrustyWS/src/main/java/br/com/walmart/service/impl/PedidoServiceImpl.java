package br.com.walmart.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.walmart.model.Pedido;
import br.com.walmart.repository.PedidoRepository;
import br.com.walmart.service.PedidoService;

@Service("pedidoService")
public class PedidoServiceImpl implements PedidoService {

	private PedidoRepository pedidoRepository;

	public PedidoServiceImpl() {
	}

	public PedidoServiceImpl(PedidoRepository pedidoRepository) {
		this.pedidoRepository = pedidoRepository;
	}

	public String salvaPedido(Pedido pedido) {
		return pedidoRepository.savePedido(pedido);
	}

	public String atualizarPedido(Pedido pedido) {
		return pedidoRepository.updatePedido(pedido);
	}

	public List<Pedido> consultarPedido(Long id_pedido) {
		return pedidoRepository.findPedidoById(id_pedido);
	}
	
	public List<Pedido> findByStatus(String status){
		return pedidoRepository.findByStatus(status);
	}

}
