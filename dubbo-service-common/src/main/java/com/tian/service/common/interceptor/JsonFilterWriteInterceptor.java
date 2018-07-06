package com.tian.service.common.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tian.service.common.res.DataResult;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.ext.WriterInterceptor;
import javax.ws.rs.ext.WriterInterceptorContext;
import java.io.IOException;

public class JsonFilterWriteInterceptor implements WriterInterceptor {

    private DataResult<String> response = new DataResult<>(200, "fail", "ces===haha");

    @Override
    public void aroundWriteTo(WriterInterceptorContext context) throws IOException, WebApplicationException {

        Object entity = context.getEntity();

        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(entity);
        System.out.println(s);

        context.setEntity(entity);

        context.proceed();
    }

}