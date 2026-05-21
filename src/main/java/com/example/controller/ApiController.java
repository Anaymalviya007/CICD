package com.example.controller;

import com.example.model.User;
import com.example.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/users")
    public List<User> getUsers() {
        return Arrays.asList(
            new User(1, "John Doe", "john@example.com"),
            new User(2, "Jane Smith", "jane@example.com"),
            new User(3, "Bob Johnson", "bob@example.com")
        );
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return Arrays.asList(
            new Product(1, "Laptop", 999.99),
            new Product(2, "Mouse", 25.50),
            new Product(3, "Keyboard", 79.99)
        );
    }

    @GetMapping("/hello")
    public Map<String, String> sayHello() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello, Welcome to Spring Boot API!");
        response.put("status", "success");
        return response;
    }
}
