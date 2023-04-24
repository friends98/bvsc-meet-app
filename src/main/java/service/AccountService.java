/**
 * 
 */
package service;

import static java.util.Collections.singletonMap;

import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

/**
 * @author it-admin
 *
 */
@Path("")
public class AccountService {
	
	private static final Logger logger = Logger.getLogger(AccountService.class);

	@GET
	@Path("login")
	@Produces(MediaType.APPLICATION_JSON)
	public Response login() {
		Map<String, String> response = singletonMap("login", "welcome to my channel");
		logger.info("SUCCESS");
		return Response.ok(response).build();
	}

}
