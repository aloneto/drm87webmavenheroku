package webservicerest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
// https://douglasmende-master-4ru7yjizur.herokuapp.com/
//https://github.com/heroku/java-getting-started 

//http://localhost:8080/javawebmaven/rest/api/registrarItemCartaoFidelidade/123

/*
Antes de iniciar precisa criar sua conta no gitHub:
 (https://guides.github.com/activities/hello-world/).

Video: https://www.youtube.com/watch?v=MdioIaiK9-Y
Até 4:50 - explica como criar um repositorio no GitHub. Esta etapa eu fiz no meu githubnão sendo necessária reproduzir para cada um.
Após esta primeira etapa explica como integrar com Eclipse. Neste ponto cada aluno deverá eguir as orientações.

Projeto para o Clone
https://github.com/douglasrm87/
 */
//@Path("/api")

//https://restfulapi.net/create-rest-apis-with-jax-rs-2-0/
@Path("/cartaofidelidade")
public class CartaoFidelidade {

	@GET
	public String validarAcessoWS() {
		return "Web Service RestFul acessado com sucesso. Parabéns.";
	}

	@GET
	@Path("/{cpf}")
	public String registrarItemCartaoFidelidade(@PathParam("cpf") String cpf) {
		return "Registrado item cartao fidelidade do CPF " + cpf + " com sucesso." + ".";
	}

}
// The request http://example.com/api/orders/345 will return "returning order with id 345".
/*
 * @ApplicationPath("api") public class MyRestApp extends Application { }
 * 
	@Produces(MediaType.APPLICATION_JSON)
 
 * @Path("/orders") public class Order {
 * 
 * @GET public String getOrders() { return "returning all orders"; }
 * 
 * @GET
 * 
 * @Path("{orderId}") public String getOrderById(
 * 
 * @PathParam("orderId") String orderId) { return "return order with id " +
 * orderId; } }
 */
