package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Demo class
 *
 * @author keriezhang
 * @date 2016/10/31
 */
@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello word";
    }
}
