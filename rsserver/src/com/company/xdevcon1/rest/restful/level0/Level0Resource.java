package com.company.xdevcon1.rest.restful.level0;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("level0/film")
public class Level0Resource {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Response action(@QueryParam("action") final String action) {

		if (action == null) {
			return Response.status(200).entity("<resp>no action :(</resp>").build();
		}

		switch (action) {

		case "show":
			return Response.status(200).entity("<film>My Movie</film>").build();

		case "delete":
			return Response.status(200).entity("<resp>Movie was deleted</resp>").build();
		default:
			return Response.status(200).entity("<resp>unknown action</resp>").build();
		}

	}

}
