package com.example.javabackendsandbox.controllers;

import com.example.javabackendsandbox.services.SimpleService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(SimpleController.class)
@ExtendWith(MockitoExtension.class)
public class SimpleControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private SimpleService simpleService;

    @Test
    void testGetSimpleResponse() throws Exception{
        mockMvc.perform(get("/v1/response/simple/"))
            .andExpect(status().isOk());
    }

    //@Test
    void testGetSimpleResponseForName() throws Exception{
        mockMvc.perform(get("/v1/response/simple/{}", "any"))
            .andExpect(status().isOk());
    }

    //@Test
    void testGetSimpleHtmlResponse() throws Exception{
        mockMvc.perform(get("/v1/response/simple/{}", "html"))
            .andExpect(status().isOk());
    }

}
