package com.company.xdevcon1.rest.basic;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("basic2")
public class BasicResource2 {

	
	private static int counter = 0;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getFilm() {

		return "Hello this is BasicResource2 called: " + counter + " times";

	}
	

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String up(){
		counter++;
		return String.valueOf(counter);
	}
	
}
