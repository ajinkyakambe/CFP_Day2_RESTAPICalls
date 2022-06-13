package com.bridgelabz.cfp_day2_restapicalls.controller;

import org.springframework.web.bind.annotation.*;

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
    /* UC2
    Make REST Call to show Hello Mark from BridgeLabz
    - Use GET Request Method and pass name as // query parameter
    - Use CURL to demonstrate the REST API Call
    - curl localhost:8080/hello/query?name=Mark-w "\n"
     */
    @GetMapping("/query")
    public String sayHelloQuery(@RequestParam(value="name") String name){
        return "Hello "+name+"from Bridgelabz!!!";
    }
    /*UC3
    Make REST Call to show Hello Mark from BridgeLabz
    - Use GET Request Method and pass name as // path variable
    - Use CURL to demonstrate the REST API Call
    - curl localhost:8080/hello/param/Mark -w "\n"
     */
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello "+name+" from Bridgelabz!!";
    }




}