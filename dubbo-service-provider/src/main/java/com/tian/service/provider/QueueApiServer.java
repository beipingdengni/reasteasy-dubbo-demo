package com.tian.service.provider;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * create date 18/3/30 and user adm
 * tian bei ping
 */

@Path("a")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({"application/json;charset=utf-8"})
public interface QueueApiServer {

    @Path("index")
    @GET
    Response index() throws Exception;

    @Path("start")
    @GET
    List start();
}
