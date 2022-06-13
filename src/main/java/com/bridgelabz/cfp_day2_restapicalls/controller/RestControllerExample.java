package com.bridgelabz.cfp_day2_restapicalls.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class RestControllerExample {

    /* UC1
        Create a Rest Controller to demonstrate
        the various HTTP Methods and respond
        hello messages to the User. To begin
        with show Hello from BridgeLabz
        - Use GET Request Method
        - Use CURL to demonstrate the REST API Call
        - curl localhost:8080/hello -w "\n"

    */
    @RequestMapping(value = {"","/"}) //Pointing towards root of controller class with hello url.
    public String sayHello(){
        return "Hello from Bridgelabz";
    }
    


}