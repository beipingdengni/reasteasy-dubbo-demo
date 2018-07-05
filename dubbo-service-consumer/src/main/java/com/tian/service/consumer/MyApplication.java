package com.tian.service.consumer;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * create date 18/3/30 and user adm
 * tian bei ping
 */
@ApplicationPath("/")
public class MyApplication extends Application {

    Set<Object> set = new HashSet<>();

    public MyApplication() {
        set.add(new QueueApiServerImpl());
    }

    @Override
    public Set<Object> getSingletons() {
        return set;
    }
}
