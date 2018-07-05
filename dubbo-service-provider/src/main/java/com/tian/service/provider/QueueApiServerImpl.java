package com.tian.service.provider;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Objects;

/**
 * create date 18/3/30 and user adm
 * tian bei ping
 */
@Path("/a")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({"application/json;charset=utf-8"})
public class QueueApiServerImpl implements QueueApiServer {

    @Override
    @Path("index")
    @GET
    @Produces({"application/json;charset=utf-8"})
    public Response index() throws Exception {

        if (Objects.equals(1, 1)) {
            throw new Exception("是吧");
        }

        return Response.status(200).build();

    }

    @Override
    @Path("start")
    @GET
    @Produces({"application/json;charset=utf-8"})
    public String start() {
        return "hello";

    }
}
