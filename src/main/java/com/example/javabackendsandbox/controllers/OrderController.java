package com.example.javabackendsandbox.controllers;

import com.example.javabackendsandbox.services.OrderService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping(path = "/v1/order")
@Tag(name = "Order Controller", description = "Sample Order Controller")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @Operation(summary = "Get orders for a given transaction",
        description = "Returns all orders for a given transaction number")
    @GetMapping(path = "/transaction/{transactionNumber}")
    public String getOrders(
        @Parameter(description = "Transaction number")
        @PathVariable("transactionNumber") String transactionNumber) {
        return orderService.getOrders(transactionNumber).toString();
    }

    @Operation(summary = "Get order details for an order",
        description = "Returns all order lines for a given order number")
    @GetMapping(path = "/details/{orderNumber}")
    public String getOrderDetails(
        @Parameter(description = "Order number")
        @PathVariable("orderNumber") int orderNumber) {
        return orderService.getOrderDetails(orderNumber).toString();
    }

}
