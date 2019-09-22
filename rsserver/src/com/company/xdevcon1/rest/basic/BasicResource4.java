package com.company.xdevcon1.rest.basic;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.company.xdevcon1.entities.Film;

@Path("basic4")
public class BasicResource4 {

	private static Map<Integer, Film> films = new HashMap<>();

	static {
		films.put(4, new Film("A New Hope", 1977));
		films.put(5, new Film("Star Wars", 1980));
		films.put(6, new Film("The Empire Strikes Back", 1983));
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getFilms() {

		return "There are: " + films.size() + " Star Wars episodes.";

	}

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Response getFilm(@PathParam("id") Integer id) {

		Film film = films.get(id);
		if (film == null) {
			return Response.status(Status.NOT_FOUND).build();
		} else {
			return Response.ok().entity(film).build();
		}
	}
	
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getFilmJson(@PathParam("id") Integer id) {

		Film film = films.get(id);
		if (film == null) {
			return Response.status(Status.NOT_FOUND).build();
		} else {
			return Response.ok().entity(film).build();
		}
	}

	@DELETE
	@Path("{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public Response kill(@PathParam("id") final Integer id) {

		Film film = films.get(id);
		if (film == null) {
			return Response.status(Status.NOT_FOUND).build();
		} else {
			return Response.ok().entity("deleted: " + films.remove(id).getTitle()).build();
		}

	}

}
