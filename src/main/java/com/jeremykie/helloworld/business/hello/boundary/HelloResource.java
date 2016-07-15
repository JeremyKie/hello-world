package com.jeremykie.helloworld.business.hello.boundary;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("hello")
public class HelloResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public JsonObject helloWorld() {
		JsonObjectBuilder builder = Json.createObjectBuilder()
				.add("message", "Hello, world!");
		return builder.build();
	}
}
