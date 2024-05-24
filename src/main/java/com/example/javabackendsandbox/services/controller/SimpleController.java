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
        System.out.println("Input >> " + name);
        var response = simpleService.SimpleResponse(name);
        System.out.println(response + " << Output");
        return response;
    }

    @RequestMapping(path = "/simple/", method = RequestMethod.GET)
    public String SimplerResponse() {
        System.out.println("Input >> {empty}");
        var response = simpleService.SimplerResponse();
        System.out.println(response + " << Output");
        return response;
    }

}
