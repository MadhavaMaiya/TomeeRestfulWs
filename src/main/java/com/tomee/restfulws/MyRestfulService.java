package com.tomee.restfulws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class MyRestfulService {

	@GET
	@Path("/sayHi")
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHi() {
		return "Hi";
	}
}
