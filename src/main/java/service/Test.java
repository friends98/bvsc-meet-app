/**
 * 
 */
package service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import connection.ConnectionUtils;

/**
 * @author it-admin
 *
 */
@Path("")
public class Test {
	private static final Logger logger = Logger.getLogger(Test.class);
	@Inject
	private ConnectionUtils connectionUtils ;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("sql")
	public Response test() throws SQLException {
		Connection response = connectionUtils.getConnection();
		return Response.ok(response.toString()).build();
	}
}
