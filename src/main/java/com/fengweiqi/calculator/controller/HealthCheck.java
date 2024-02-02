package com.fengweiqi.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthCheck")
public class HealthCheck {
    @GetMapping("/v1")
    public String healthCheck(){
        return "success";
    }
}
