package com.example.javabackendsandbox.services.controller;

import com.example.javabackendsandbox.services.core.SimpleService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/response")
public class SimpleController {

    private final SimpleService simpleService;

    public SimpleController(SimpleService simpleService) {
        this.simpleService = simpleService;
    }

    @RequestMapping(path = "/simple/{name}", method = RequestMethod.GET)
    public String SimplerResponse(@PathVariable("name") String name) {
        return simpleService.SimpleResponse(name);
    }

    @RequestMapping(path = "/simple", method = RequestMethod.GET)
    public String SimplerResponse() {
        return simpleService.SimplerResponse();
    }

}
