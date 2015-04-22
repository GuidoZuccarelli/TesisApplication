package api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/items")
public class ItemsRestfulApi {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/ranking")
 	public Response getItemsRanking(@QueryParam("fechaInicio") String startDate, @QueryParam("fechaFin") String endDate, 
 			@QueryParam("rankingPorCantidad") Boolean countRank) {
		return null;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/lista")
	public Response getItems(@QueryParam("tipo") String type, @QueryParam("nombre") String name) {
		return null;
	}
	
	
}
