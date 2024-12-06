package com.code_bhuvanesh.ShadowTalks.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class chatController {
    @GetMapping("/")
    public  String chat(){
        return "hello world";
    }

}
