package com.example.demo.routes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestMappings {

    @GetMapping("/api/health")
    public String checkHealth() {
        return "API is running";
    }

    @GetMapping("/api/version")
    public String version() {
        return "v1.0.0";
    }
}
