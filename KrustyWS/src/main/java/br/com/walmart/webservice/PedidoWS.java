package br.com.walmart.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.com.walmart.model.Pedido;

@Path("/pedido")
public interface PedidoWS {

	@GET
	@Path("/consulta/{param}")
	@Produces("application/json")
	public abstract Response consultaPedido(@PathParam("param") Long id_pedido);

	@POST
	@Path("/salva/{param}")
	@Produces("application/json")
	public abstract Response salvaPedido(Pedido pedido);

	@POST
	@Path("/atualiza/{param}")
	@Produces("application/json")
	public abstract Response atualizaPedido(Pedido pedido);
}
