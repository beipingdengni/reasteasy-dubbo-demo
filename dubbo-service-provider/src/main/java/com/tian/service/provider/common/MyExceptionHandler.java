package com.tian.service.provider.common;

import javax.ws.rs.Consumes;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * create date 18/3/30 and user adm
 * tian bei ping
 */

//@Provider
//@Consumes("*/*")
//@Produces("*/*")
public class MyExceptionHandler implements ExceptionMapper<Exception> {
    @Override
    public Response toResponse(Exception e) {


        if (e instanceof NotFoundException){
            return Response.status(200).entity(new CommonResponse<>(200, "not found", e.getMessage())).build();
        }
        System.out.println(e.getMessage());
        CommonResponse<String> response = new CommonResponse<>(200, "fail", e.getMessage());
        return Response.status(200).entity(response).build();
    }
}
