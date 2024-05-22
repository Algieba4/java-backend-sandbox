package com.example.javabackendsandbox.services.core;

import org.springframework.stereotype.Component;

@Component
public class SimpleService {

    public String SimpleResponse(String name) {
        return String.format("Hello, %s", name);
    }
    public String SimplerResponse() {
        return "Hello";
    }


}
