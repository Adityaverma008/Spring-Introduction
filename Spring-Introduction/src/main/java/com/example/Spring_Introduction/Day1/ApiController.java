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

    //Make REST Call to show Hello {name} from BridgeLabz
    @GetMapping("/hello/query")
    public String query(@RequestParam("name") String name){
        return "Hello "+name+" from Bridgelabz";
    }

    // Make REST Call to show Hello {name} from BridgeLabz as path variable
    @GetMapping("/hello/param/{name}")
    public String hello(@PathVariable String name) {
        return "Hello "+name+" from Bridgelabz";
    }

    @PostMapping("/hello/post")
    public String greetUser(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }


}
