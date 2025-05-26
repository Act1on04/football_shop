package com.example.demo.services;

import com.example.demo.models.Order;
import java.util.List;

public interface OrderService {
    List<Order> getAllOrders();
    void placeOrder(Order order);
}
