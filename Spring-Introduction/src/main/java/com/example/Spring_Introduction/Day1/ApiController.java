package com.example.Spring_Introduction.Day1;

import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {
    //Create a Rest Controller to demonstrate the various HTTP Methods and respond
    //hello messages to the User. To begin
    //with show Hello from BridgeLabz.
    @GetMapping("/hello")
    public String hello(){
        return "Hello from BridgeLabz";
    }


}
