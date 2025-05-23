package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class control {

	// UC1-hello
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
    
    // UC2-user
    @GetMapping("/user")
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + "!";
	}
}