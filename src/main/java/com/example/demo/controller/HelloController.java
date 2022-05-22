package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lijiajun
 * @date 2022年05月22日21:58
 */
@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping
    public String hello(){
        return "Hello World";
    }
}
