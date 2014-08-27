package br.com.walmart.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {

	@Id
	@Column(name="id_pedido")
	private int id_pedido;
	
	@ManyToMany
	@JoinTable(  
	        name="pedido_produto",  
	        joinColumns=@JoinColumn(name="id_pedido"),  
	        inverseJoinColumns=@JoinColumn(name="id_produto")  
	    )  
    private List<Produto> produtos;
	
	@Column(name="status")
	private StatusPedido status;

	public int getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	
	
}
