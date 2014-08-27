package br.com.walmart.model;

public enum TipoProduto {
	Hamburguer(1), Bebida (2);
	
	public int produto;
	
	TipoProduto(int valor) {
		produto = valor;
	}
	
}
