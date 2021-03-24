package com.sheliming.controller;

import com.sheliming.DemoApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    @GetMapping("hello")
    public String hello(String name) {
        logger.info("hello " + name);
        return "hello " + name;
    }
}
