package com.gramcha.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gramachandran on 29/10/18.
 */
//@RestController(value = "/auth")
public class AuthController {

    @RequestMapping("/ping")
    public String ping(){
        return "ping pong";
    }
}
