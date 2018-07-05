package com.tian.service.provider.common;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;

/**
 * create date 18/3/30 and user adm
 * tian bei ping
 */
//@Provider
//@Consumes("*/*")
//@Produces("*/*")
public class MyMessageBodyWriter implements MessageBodyWriter<Object> {
    @Override
    public boolean isWriteable(Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType) {

        return true;

    }

    @Override
    public long getSize(Object o, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return 0;
    }

    @Override
    public void writeTo(Object object, Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, Object> multivaluedMap, OutputStream outputStream) throws IOException, WebApplicationException {

        String charset = mediaType.getParameters().get("charset");

        if (charset == null) {
            outputStream.write(object.toString().getBytes(StandardCharsets.UTF_8));
        } else {
            ObjectMapper objectMapper = new ObjectMapper();
            String s = objectMapper.writeValueAsString(object);
            byte[] bytes = s.getBytes(charset);
            outputStream.write(bytes);
        }
    }
}
