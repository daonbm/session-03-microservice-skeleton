package com.session03.category_service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/api/greeting")
public class GreetingController {

    @Value("${app.message}") // get value from config server, with default fallback
    private String message;

    @GetMapping
    public String getMessage() {
        return this.message;
    }
}
