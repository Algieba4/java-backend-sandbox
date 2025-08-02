package com.example.javabackendsandbox.controllers;

import com.example.javabackendsandbox.services.SimpleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping(path = "/v1/response")
@Tag(name = "Simple Controller", description = "Sample Simple Controller")
public class SimpleController {

    private final SimpleService simpleService;

    public SimpleController(SimpleService simpleService) {
        this.simpleService = simpleService;
    }

    @Operation(summary = "Returns a simple greeting",
        description = "Returns a simple greeting to the user")
    @RequestMapping(path = "/simple/{name}", method = RequestMethod.GET)
    public String SimplerResponse(
        @Parameter(description = "Person's name")
        @PathVariable("name") String name) {
        return simpleService.SimpleResponse(name);
    }

    @Operation(summary = "Returns a simple Hello",
        description = "Returns a simple Hello to the user")
    @RequestMapping(path = "/simple/", method = RequestMethod.GET)
    public String SimplerResponse() {
        return simpleService.SimplerResponse();
    }

    @Operation(summary = "Returns a greeting in HTML format",
        description = "Returns a simple greeting in HTML format back to the user")
    @RequestMapping(path = "/simple/html", method = RequestMethod.GET)
    public String SimpleHtmlResponse() {
        return simpleService.SimpleHtmlResponse();
    }

}
