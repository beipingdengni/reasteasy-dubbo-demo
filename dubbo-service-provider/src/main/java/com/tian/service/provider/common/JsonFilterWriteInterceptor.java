package com.tian.service.provider.common;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.WriterInterceptor;
import javax.ws.rs.ext.WriterInterceptorContext;
import java.io.IOException;

/**
 * create date 18/3/30 and user adm
 * tian bei ping
 */
//@Provider
public class JsonFilterWriteInterceptor implements WriterInterceptor {

    private CommonResponse<String> response = new CommonResponse<>(200, "fail", "ces===haha");

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