package com.spring_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/init")
public class InitController {
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }
}
