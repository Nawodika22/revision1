package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Access this at: http://localhost:8080/hello
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from my brand new Controller file! hii";
    }

    // Access this at: http://localhost:8080/hello/greet?name=YourName
    @GetMapping("/hello/greet")
    public String greetUser(@RequestParam(value = "name", defaultValue = "Guest") String name) {
        return "Welcome to Spring Boot, " + name + "!";
    }
}