package com.revature.spring.azure.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String hello(){
        return "Hello from spring and azure demo";
    }
}
