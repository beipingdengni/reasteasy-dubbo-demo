package com.tian.service.provider;

import javax.ws.rs.core.Response;

/**
 * create date 18/3/30 and user adm
 * tian bei ping
 */

public interface QueueApiServer {

    Response index() throws Exception;

    String start();
}
