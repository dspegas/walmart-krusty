package br.com.walmart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;
import org.jboss.resteasy.util.GenericType;

import br.com.walmart.model.Pedido;
import br.com.walmart.model.StatusPedido;



/**
 * Servlet implementation 
 */

public class KrustyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static final String ROOT_URL_CONSULTA_STATUS = "http://localhost:8080/KrustyWS/rest/pedido/consultaStatus/";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public KrustyServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		ClientRequest requestWS = new ClientRequest(ROOT_URL_CONSULTA_STATUS);
		requestWS.body("application/json", StatusPedido.Pedido);
		ClientResponse<Pedido> responseWS = null;
		try {
			responseWS = requestWS.get(new GenericType<Pedido>() {});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println(responseWS);
	}
}
