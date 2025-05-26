package com.example.demo.controllers.admin;

import com.example.demo.models.Product;
import com.example.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/admin/products")
    public String productList(Model model) {
        model.addAttribute("products", productService.findAll());
        return "admin/products";
    }
}
