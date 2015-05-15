package com.rest.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.media.multipart.FormDataParam;

import com.rest.bean.HelloBean;

@Path ("/rest")
public class SumController {
	
	@GET
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	@Path(value = "sum")
	public String sum (@QueryParam (value = "num1") Integer num1, @QueryParam (value = "num2") Integer num2) {
		Integer result = num1 + num2;
		return result.toString();
	}
	
	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/hello")
	public String hello (String name) {
		return new HelloBean(name).getName();
	}
	
	@POST
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.TEXT_PLAIN)
	@Path(value = "postFormData")
	public String uploadFile (@FormDataParam("uploadFile") String s) {
		return s;
	}
	
}
