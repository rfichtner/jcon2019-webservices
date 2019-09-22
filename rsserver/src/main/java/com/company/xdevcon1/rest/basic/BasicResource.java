package com.company.xdevcon1.rest.basic;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
@Path("basic")
public class BasicResource {

	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getFilm() {

		return "Hello this is BasicResource";

	}
}
