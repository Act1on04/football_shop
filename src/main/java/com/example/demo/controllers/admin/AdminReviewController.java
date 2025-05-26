package com.example.demo.controllers.admin;

import com.example.demo.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminOrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/admin/orders")
    public String orderList(Model model) {
        model.addAttribute("orders", orderService.getAllOrders());
        return "admin/orders";
    }
}
