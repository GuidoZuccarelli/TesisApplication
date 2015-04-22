package api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/tipos")
public class TiposRestfulApi {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
 	public Response getTypes() {
		return null;
	}

}
