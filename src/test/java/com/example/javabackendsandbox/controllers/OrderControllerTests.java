package com.example.javabackendsandbox.controllers;

import com.example.javabackendsandbox.services.OrderService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(OrderController.class)
@ExtendWith(MockitoExtension.class)
public class OrderControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private OrderService orderService;

    //@Test
    void testGetOrdersForTransaction() throws Exception{
        mockMvc.perform(get("/v1/order/transaction/{}", "any"))
            .andExpect(status().isOk());
    }

    //@Test
    void testGetOrderDetailsForOrder1() throws Exception{
        mockMvc.perform(get("/v1/order/details/{}", "1"))
            .andExpect(status().isOk());
    }

    //@Test
    void testGetOrderDetailsForOrder2() throws Exception{
        mockMvc.perform(get("/v1/order/details/{}", "2"))
            .andExpect(status().isOk());
    }

}
