package com.example.rc2springsecurity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @GetMapping
    public String greet() {
        return "Hello There!";
    }
    
    
}
