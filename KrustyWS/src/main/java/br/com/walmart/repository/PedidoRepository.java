package br.com.walmart.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.walmart.model.Pedido;

@Repository
public class PedidoRepository {

	protected EntityManager em;

	public EntityManager getEntityManager() {
		return em;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.em = entityManager;
	}

	// Metodo para buscar pedido pelo id do pedido
	public List<Pedido> findPedidoById(Long id_pedido) {

		String query = "SELECT m FROM Pedido m WHERE id_pedido = :id_pedido";
		List<Pedido> result = em.createQuery(query, Pedido.class)
				.setParameter("id_pedido", id_pedido.intValue())
				.getResultList();

		return result;
	}

	// metodo que salvar um pedido
	public String savePedido(Pedido pedido) {

		String retorno = "Pedido efetuado com sucesso.";
		try {
			em.persist(pedido);
		} catch (Exception e) {
			retorno = "Erro: " + e.getMessage();
		}
		return retorno;
	}

	// metodo que atualizar um pedido
	public String updatePedido(Pedido pedido) {
		String retorno = "Pedido atualizado com sucesso.";
		try {
			em.refresh(pedido);
		} catch (Exception e) {
			retorno = "Erro: " + e.getMessage();
		}
		return retorno;
	}

}
