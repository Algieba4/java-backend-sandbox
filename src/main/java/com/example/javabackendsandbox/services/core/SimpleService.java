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

    public String SimpleHtmlResponse() {
        return """
                <!doctype html>
                <html>
                    <head>
                        <title>Simple HTML Response</title>
                    </head>
                    <body>
                        <center><b>Simple HTML Response</b></center>
                        <br />
                        Simple HTML Response
                    </body>
                </html>
                """;
    }
}
