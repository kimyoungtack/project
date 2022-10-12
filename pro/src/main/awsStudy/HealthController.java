package com.example.demo;
@RestController
public class HealthController {    
    @GetMapping
    public String healthCheck(){
        return "health ok";
    }
}
