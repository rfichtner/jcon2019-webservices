package com.company.xdevcon1.rest.restful;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@ApplicationScoped
@Path("one")
public class First {

	@GET
	public String hello(@QueryParam("name") final String name8) {
		return "Hello World " + name8; 
	}

}


