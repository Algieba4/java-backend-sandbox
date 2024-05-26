package com.example.javabackendsandbox.services.controller;

import com.example.javabackendsandbox.services.core.SimpleService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
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

    @RequestMapping(path = "/simple/", method = RequestMethod.GET)
    public String SimplerResponse() {
        return simpleService.SimplerResponse();
    }

    @RequestMapping(path = "/simple/html", method = RequestMethod.GET)
    public String SimpleHtmlResponse() {
        return simpleService.SimpleHtmlResponse();
    }

}
