package com.tian.service.provider;

import com.tian.service.provider.handler.DealUserHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Objects;

/**
 * create date 18/3/30 and user adm
 * tian bei ping
 */
@Component("queueApiServer")
public class QueueApiServerImpl implements QueueApiServer {

    @Autowired
    DealUserHandler dealUserHandler;

    @Override
    public Response index() throws Exception {

        if (Objects.equals(1, 1)) {
            throw new Exception("是吧");
        }

        return Response.status(200).build();

    }

    @Override
    public List<String> start() {
        return dealUserHandler.editUser();

    }
}
