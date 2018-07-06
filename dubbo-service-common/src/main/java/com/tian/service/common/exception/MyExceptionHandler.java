package com.tian.service.common.exception;


import com.tian.service.common.res.DataResult;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class MyExceptionHandler implements ExceptionMapper<Exception> {
    @Override
    public Response toResponse(Exception e) {


        if (e instanceof NotFoundException){
            return Response.status(200).entity(new DataResult<>(200, "not found", e.getMessage())).build();
        }
        System.out.println(e.getMessage());
        DataResult<String> response = new DataResult<>(200, "fail", e.getMessage());
        return Response.status(200).entity(response).build();
    }
}

