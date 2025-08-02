package com.example.javabackendsandbox.services;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public JSONArray getOrders(String transactionNumber) {

        JSONArray orders = new JSONArray();

        JSONObject order1 = new JSONObject();
        order1.put("Order Number", 1);
        order1.put("Transaction Number", "1-1-1");
        order1.put("Order Date", "2020-01-01");
        order1.put("Total Cost", 84.98);
        orders.put(order1);

        JSONObject order2 = new JSONObject();
        order2.put("Order Number", 2);
        order2.put("Transaction Number", "1-1-1");
        order2.put("Order Date", "2024-01-01");
        order2.put("Order Date", "2024-01-01");
        order2.put("Total Cost", 19.98);
        orders.put(order2);

        return orders;

    }

    public JSONObject getOrderDetails(int orderNumber) {
        JSONObject order = new JSONObject();
        JSONArray orderItems = new JSONArray();

        if(orderNumber == 1) {
            order.put("Order Number", 1);
            JSONObject orderOneItemOne = new JSONObject();
            orderOneItemOne.put("Item Number", 1);
            orderOneItemOne.put("Description", "T-shirt");
            orderOneItemOne.put("Quantity", 1);
            orderOneItemOne.put("Cost Per", 24.99);
            orderOneItemOne.put("Cost Total", 24.99);
            orderItems.put(orderOneItemOne);
            JSONObject orderOneItemTwo = new JSONObject();
            orderOneItemTwo.put("Item Number", 2);
            orderOneItemTwo.put("Description", "Pants");
            orderOneItemTwo.put("Cost", 59.99);
            orderItems.put(orderOneItemTwo);
            order.put("Items", orderItems);
        } else {
            order.put("Order Number", 2);
            JSONObject orderTwoItemOne = new JSONObject();
            orderTwoItemOne.put("Item Number", 3);
            orderTwoItemOne.put("Description", "Socks");
            orderTwoItemOne.put("Quantity", 2);
            orderTwoItemOne.put("Cost Per", 9.99);
            orderTwoItemOne.put("Cost Total", 19.98);
            orderItems.put(orderTwoItemOne);
            order.put("Items", orderItems);
        }
        return order;
    }

}
