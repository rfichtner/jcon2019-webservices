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

import com.company.xdevcon1.entities.Film;

@Path("basic3")
public class BasicResource3 {

	
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
	public Response getFilm(@PathParam("id") Integer id){
		
		return Response.ok().entity(films.get(id.intValue())).build();
	}

	
	@DELETE
	@Path("{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String kill(@PathParam("id") final Integer id){
		
		return "deleted: " + films.remove(id.intValue()).getTitle();
	}
	
}
