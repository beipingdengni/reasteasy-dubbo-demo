package com.tian.service.provider.handler;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DealUserHandler {

    public List<String> editUser() {

        return Arrays.asList("name", "age", "sex");
    }

}
