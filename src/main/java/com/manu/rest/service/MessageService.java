package com.manu.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;


@Path("/message")
public class MessageService {
	
	@GET
	@Path("/{name}")
	public Response getMessage(@PathParam("name") String message) {
		
		String msg = "Hello : " + message;
		
		return Response.status(200).entity(msg).build();
	}

}
