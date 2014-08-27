package br.com.walmart.model;

public enum StatusPedido {
	Pedido(1), Preparacao (2), Pronto(3), Entregue (4);
	
	public int status;
	
	StatusPedido(int valor) {
		status = valor;
	}
}
