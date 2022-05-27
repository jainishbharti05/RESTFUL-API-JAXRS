package com.datagrokr.socialiser.exception;

import com.datagrokr.socialiser.model.ErrorMessage;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.ext.ExceptionMapper;


public class GenericExceptionMapper implements ExceptionMapper<Throwable>{
	@Override
	public Response toResponse(Throwable exception) {
		ErrorMessage errorMessage = new ErrorMessage(exception.getMessage(), 500, "http://www.google.com");
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(errorMessage).build();
	}
}
